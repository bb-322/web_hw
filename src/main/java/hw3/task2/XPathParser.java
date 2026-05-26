package hw3.task2;

import hw3.task2.greenhouse.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;

public class XPathParser {
    static void main() throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {

        File file = new File("src/main/java/hw3/greenhouse.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document doc = builder.parse(file);

        XPathFactory xPathfactory = XPathFactory.newInstance();
        XPath xpath = xPathfactory.newXPath();

        NodeList flowers = (NodeList) xpath.evaluate("//flower", doc, XPathConstants.NODESET);

        for (int i = 0; i < flowers.getLength(); i++) {

            Node flower = flowers.item(i);

            Flower f = new Flower();
            VisualParams vp = new VisualParams();
            GrowingTips gt = new GrowingTips();

            f.setVisualParams(vp);
            f.setGrowingTips(gt);

            f.setId(Integer.parseInt(xpath.evaluate("@id", flower)));
            f.setName(xpath.evaluate("name", flower));
            f.setSoil(Soil.valueOf(xpath.evaluate("soil", flower).toUpperCase()));
            f.setOrigin(xpath.evaluate("origin", flower));

            vp.setStemColor(xpath.evaluate("visual_params/stem_color", flower));
            vp.setLeafColor(xpath.evaluate("visual_params/leaf_color", flower));
            vp.setAverageSize(xpath.evaluate("visual_params/average_size", flower));

            gt.setTemperature(Integer.parseInt(xpath.evaluate("growing_tips/temperature", flower)));
            gt.setLight(xpath.evaluate("growing_tips/light", flower));
            gt.setWatering(xpath.evaluate("growing_tips/watering", flower));

            f.setMultiplying(Multiplying.valueOf(xpath.evaluate("multiplying", flower).toUpperCase()));

            System.out.println(f);

        }

    }

}
