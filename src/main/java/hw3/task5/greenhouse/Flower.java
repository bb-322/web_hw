package hw3.task5.greenhouse;

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "flower")
@XmlAccessorType(XmlAccessType.FIELD)
public class Flower {

    @XmlAttribute
    private int id;

    @XmlElement
    private String name;

    @XmlElement
    @XmlJavaTypeAdapter(SoilAdapter.class)
    private Soil soil;

    @XmlElement
    private String origin;

    @XmlElement(name = "visual_params")
    private VisualParams visualParams;

    @XmlElement(name = "growing_tips")
    private GrowingTips growingTips;

    @XmlElement
    @XmlJavaTypeAdapter(MultiplyingAdapter.class)
    private Multiplying multiplying;

    @Override
    public String toString() {
        return "Flower{\n" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", soil=" + soil +
                ", origin='" + origin + '\'' +
                ", visualParams=" + visualParams +
                ", growingTips=" + growingTips +
                ", multiplying=" + multiplying +
                '}';
    }
}
