package LW10.Tasks;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.File;

public class AnimalXmlManager {
    private static final String FILE_PATH = "src/LW10/Tasks/animals.xml";

    public static void main(String[] args) {
        try {
            createXmlFile();
            System.out.println("Исходный XML-файл:");
            printAnimals();

            addAnimal("Мурка", "Кошка", 2019);
            addAnimal("Рекс", "Собака", 2021);

            System.out.println("\nПосле добавления новых животных:");
            printAnimals();

            System.out.println("\nПоиск по типу = Кошка:");
            findAnimals("Кошка", null);

            System.out.println("\nПоиск по году = 2021:");
            findAnimals(null, "2021");

            deleteAnimalByName("Хомка");
            System.out.println("\nПосле удаления животного Хомка:");
            printAnimals();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createXmlFile() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document doc = builder.newDocument();
        Element root = doc.createElement("animals");
        doc.appendChild(root);

        appendAnimal(doc, root, "Барсик", "Кот", "2018");
        appendAnimal(doc, root, "Хомка", "Хомяк", "2020");
        appendAnimal(doc, root, "Кеша", "Попугай", "2022");

        saveDocument(doc);
    }

    public static void addAnimal(String name, String type, int year) throws Exception {
        Document doc = loadDocument();
        Element root = doc.getDocumentElement();
        appendAnimal(doc, root, name, type, String.valueOf(year));
        saveDocument(doc);
    }

    public static void findAnimals(String type, String year) throws Exception {
        Document doc = loadDocument();
        NodeList nodeList = doc.getElementsByTagName("animal");

        boolean found = false;
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element animal = (Element) node;
                String currentType = animal.getElementsByTagName("type").item(0).getTextContent();
                String currentYear = animal.getElementsByTagName("year").item(0).getTextContent();

                boolean typeMatches = (type == null || currentType.equalsIgnoreCase(type));
                boolean yearMatches = (year == null || currentYear.equals(year));

                if (typeMatches && yearMatches) {
                    found = true;
                    System.out.println("Имя: " + animal.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Тип: " + currentType);
                    System.out.println("Год рождения: " + currentYear);
                    System.out.println();
                }
            }
        }

        if (!found) {
            System.out.println("Совпадения не найдены.");
        }
    }

    public static void deleteAnimalByName(String animalName) throws Exception {
        Document doc = loadDocument();
        NodeList nodeList = doc.getElementsByTagName("animal");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element animal = (Element) node;
                String name = animal.getElementsByTagName("name").item(0).getTextContent();
                if (name.equalsIgnoreCase(animalName)) {
                    Node parentNode = animal.getParentNode();
                    parentNode.removeChild(animal);
                    saveDocument(doc);
                    return;
                }
            }
        }
    }

    public static void printAnimals() throws Exception {
        Document doc = loadDocument();
        NodeList nodeList = doc.getElementsByTagName("animal");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element animal = (Element) node;
                System.out.println("Животное #" + (i + 1));
                System.out.println("Имя: " + animal.getElementsByTagName("name").item(0).getTextContent());
                System.out.println("Тип: " + animal.getElementsByTagName("type").item(0).getTextContent());
                System.out.println("Год рождения: " + animal.getElementsByTagName("year").item(0).getTextContent());
                System.out.println();
            }
        }
    }

    private static void appendAnimal(Document doc, Element root, String name, String type, String year) {
        Element animal = doc.createElement("animal");

        Element nameElement = doc.createElement("name");
        nameElement.appendChild(doc.createTextNode(name));
        animal.appendChild(nameElement);

        Element typeElement = doc.createElement("type");
        typeElement.appendChild(doc.createTextNode(type));
        animal.appendChild(typeElement);

        Element yearElement = doc.createElement("year");
        yearElement.appendChild(doc.createTextNode(year));
        animal.appendChild(yearElement);

        root.appendChild(animal);
    }

    private static Document loadDocument() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new File(FILE_PATH));
        doc.getDocumentElement().normalize();
        return doc;
    }

    private static void saveDocument(Document doc) throws Exception {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(FILE_PATH));
        transformer.transform(source, result);
    }
}
