package LW10.Tasks;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExcelRobustReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите путь к Excel-файлу: ");
                String filePath = scanner.nextLine();

                System.out.print("Введите имя листа: "); // Животные
                String sheetName = scanner.nextLine();

                readExcelFile(filePath, sheetName);
                break;
            } catch (IOException e) {
                System.out.println("Ошибка ввода-вывода: " + e.getMessage());
                System.out.println("Проверьте, существует ли файл и не открыт ли он в другой программе.");
            } catch (InvalidFormatException e) {
                System.out.println("Неверный формат файла: " + e.getMessage());
                System.out.println("Убедитесь, что выбран корректный файл Excel формата .xlsx.");
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Попробуйте снова и укажите корректное имя листа.");
            } catch (Exception e) {
                System.out.println("Неожиданная ошибка: " + e.getMessage());
            }

            System.out.print("Хотите повторить попытку? (да/нет): ");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("да")) {
                System.out.println("Программа завершена.");
                break;
            }
        }

        scanner.close();
    }

    public static void readExcelFile(String filePath, String sheetName)
            throws IOException, InvalidFormatException {
        File file = new File(filePath);

        if (!file.exists()) {
            throw new IOException("Файл не найден.");
        }

        if (!filePath.toLowerCase().endsWith(".xlsx")) {
            throw new InvalidFormatException("Поддерживаются только файлы с расширением .xlsx");
        }

        try (FileInputStream inputStream = new FileInputStream(file);
             XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {

            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new IllegalArgumentException("Лист \"" + sheetName + "\" отсутствует в файле.");
            }

            System.out.println("\nСодержимое листа \"" + sheetName + "\":");
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(getCellValue(cell) + "\t");
                }
                System.out.println();
            }
        }
    }

    private static String getCellValue(Cell cell) {
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            case BLANK:
                return "";
            default:
                return "Неизвестный тип";
        }
    }
}
