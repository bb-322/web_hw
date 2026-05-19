package hw1.task5;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XmlValidator {
    static void main() {
        String xmlFile = "src/main/java/hw1/task5/greenhouse.xml";
        String xsdFile = "src/main/java/hw1/task5/greenhouse.xsd";
        boolean isValid = validateXMLSchema(xsdFile, xmlFile);
        System.out.println(isValid);
    }

    private static boolean validateXMLSchema(String xsdPath, String xmlPath) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema s = factory.newSchema(new File(xsdPath));
            Validator validator = s.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
            return true;
        } catch (SAXException | IOException e) {
            System.out.println("err: " + e.getMessage());
            return false;
        }
    }
}
