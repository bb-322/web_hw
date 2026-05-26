package hw3.task5;

import hw3.task5.greenhouse.*;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class Main {
    static void main() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Greenhouse.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        File file = new File("src/main/java/hw3/greenhouse.xml");

        Greenhouse greenhouse = (Greenhouse) unmarshaller.unmarshal(file);

        System.out.println(greenhouse);
    }
}
