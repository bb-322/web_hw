package hw1.task5;

import hw1.task5.greenhouse.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DOMParser {
    static void main() throws ParserConfigurationException, IOException, SAXException {
        List<Flower> flowers = new ArrayList<>();

        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse("src/main/java/hw1/task5/greenhouse.xml");

        NodeList nodes = doc.getElementsByTagName("flower");

        for (int i = 0; i < nodes.getLength(); i++) {
            Element el = (Element) nodes.item(i);

            Flower f = new Flower();
            f.setId(Integer.parseInt(el.getAttribute("id")));
            f.setName(getText(el, "name"));
            f.setOrigin(getText(el, "origin"));
            f.setSoil(Soil.valueOf(getText(el, "soil").toUpperCase()));
            f.setMultiplying(Multiplying.valueOf(getText(el, "multiplying").toUpperCase()));

            Element vpEl = (Element) el.getElementsByTagName("visual_params").item(0);
            VisualParams vp = new VisualParams();
            vp.setStemColor(getText(vpEl, "stem_color"));
            vp.setLeafColor(getText(vpEl, "leaf_color"));
            vp.setAverageSize(getText(vpEl, "average_size"));
            f.setVisualParams(vp);

            Element gtEl = (Element) el.getElementsByTagName("growing_tips").item(0);
            GrowingTips gt = new GrowingTips();
            gt.setLight(getText(gtEl, "light"));
            gt.setTemperature(Integer.parseInt(getText(gtEl, "temperature")));
            gt.setWatering(getText(gtEl, "watering"));
            f.setGrowingTips(gt);

            flowers.add(f);
        }

        flowers.sort(Comparator.comparing(Flower::getName));

        for (Flower f : flowers){
            System.out.println(f);
        }

    }

    private static String getText(Element parent, String tag) {
        return parent.getElementsByTagName(tag)
                .item(0)
                .getTextContent();
    }

}
