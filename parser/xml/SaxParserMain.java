package Parser.xml;

import Parser.xml.Plant;
import Parser.xml.SaxParserHandler;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;

public class SaxParserMain {
    public static void main(String[] args) {

        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser= factory.newSAXParser();
            SaxParserHandler handler= new SaxParserHandler();
            parser.parse("plant.xml",handler);
            List<Plant> plants=handler.getPlants();
            plants.forEach(System.out::println);

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
