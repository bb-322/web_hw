package hw2.task4;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Candy> candies = new ArrayList<>();
        try {

            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader reader = factory.createXMLStreamReader(new FileReader("src/main/java/hw2/task4/candies.xml"));

            Candy c = null;

            while (reader.hasNext()) {
                int event = reader.next();
                if (event == XMLStreamConstants.START_ELEMENT) {
                    String tagName = reader.getLocalName();
                    switch (tagName) {
                        case "candy":
                            c = new Candy();
                            c.setId(Integer.parseInt(reader.getAttributeValue(null, "id")));
                            break;
                        case "name":
                            c.setName(reader.getElementText());
                            break;
                        case "type":
                            c.setType(reader.getElementText());
                            break;
                        case "producer":
                            c.setProducer(reader.getElementText());
                            break;
                        case "weight":
                            c.setWeight(Integer.parseInt(reader.getElementText()));
                            break;
                        case "price":
                            c.setPrice(Integer.parseInt(reader.getElementText()));
                            break;
                    }
                }

                if ((event == XMLStreamConstants.END_ELEMENT) && reader.getLocalName().equals("candy")) {
                    candies.add(c);
                }

            }
            System.out.println(candies);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
