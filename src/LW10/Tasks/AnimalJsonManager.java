package LW10.Tasks;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

public class AnimalJsonManager {
    private static final String FILE_PATH = "src/LW10/Tasks/animals.json";

    public static void main(String[] args) {
        try {
            createJsonFile();
            System.out.println("Исходный JSON-файл:");
            printAnimals();

            addAnimal("Мурка", "Кошка", 2019);
            addAnimal("Рекс", "Собака", 2021);

            System.out.println("\nПосле добавления новых животных:");
            printAnimals();

            System.out.println("\nПоиск животных по типу = Кошка:");
            findAnimalsByType("Кошка");

            deleteAnimalByName("Хомка");
            System.out.println("\nПосле удаления животного Хомка:");
            printAnimals();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createJsonFile() throws Exception {
        JSONObject root = new JSONObject();
        JSONArray animals = new JSONArray();

        animals.add(createAnimalObject("Барсик", "Кот", 2018));
        animals.add(createAnimalObject("Хомка", "Хомяк", 2020));
        animals.add(createAnimalObject("Кеша", "Попугай", 2022));

        root.put("animals", animals);
        saveJson(root);
    }

    public static void addAnimal(String name, String type, int year) throws Exception {
        JSONObject root = loadJson();
        JSONArray animals = (JSONArray) root.get("animals");

        animals.add(createAnimalObject(name, type, year));
        saveJson(root);
    }

    public static void findAnimalsByType(String type) throws Exception {
        JSONObject root = loadJson();
        JSONArray animals = (JSONArray) root.get("animals");

        for (Object obj : animals) {
            if (obj instanceof JSONObject) {
                JSONObject animal = (JSONObject) obj;

                if (type.equalsIgnoreCase((String) animal.get("type"))) {
                    System.out.println("Имя: " + animal.get("name"));
                    System.out.println("Тип: " + animal.get("type"));
                    System.out.println("Год рождения: " + animal.get("year"));
                    System.out.println();
                }
            }
        }
    }

    public static void deleteAnimalByName(String name) throws Exception {
        JSONObject root = loadJson();
        JSONArray animals = (JSONArray) root.get("animals");

        Iterator iterator = animals.iterator();
        while (iterator.hasNext()) {
            JSONObject animal = (JSONObject) iterator.next();
            if (name.equalsIgnoreCase((String) animal.get("name"))) {
                iterator.remove();
            }
        }

        saveJson(root);
    }

    public static void printAnimals() throws Exception {
        JSONObject root = loadJson();
        JSONArray animals = (JSONArray) root.get("animals");

        for (Object obj : animals) {
            JSONObject animal = (JSONObject) obj;
            System.out.println("Имя: " + animal.get("name"));
            System.out.println("Тип: " + animal.get("type"));
            System.out.println("Год рождения: " + animal.get("year"));
            System.out.println();
        }
    }

    private static JSONObject createAnimalObject(String name, String type, int year) {
        JSONObject animal = new JSONObject();
        animal.put("name", name);
        animal.put("type", type);
        animal.put("year", year);
        return animal;
    }

    private static JSONObject loadJson() throws Exception {
        JSONParser parser = new JSONParser();
        return (JSONObject) parser.parse(new FileReader(FILE_PATH));
    }

    private static void saveJson(JSONObject root) throws Exception {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            writer.write(root.toJSONString());
        }
    }
}
