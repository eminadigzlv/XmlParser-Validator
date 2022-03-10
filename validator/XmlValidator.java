package Validator;

import org.xml.sax.SAXException;

import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XmlValidator {
    public static void main(String[] args) {
        {
            try {
                SchemaFactory factroy = SchemaFactory.newDefaultInstance();
                Schema schema = factroy.newSchema(new File("plant.xsd"));

                Validator validator = schema.newValidator();
                validator.validate(new StreamSource("plant.xml"));
                System.out.println("No Problems");
            } catch (SAXException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
