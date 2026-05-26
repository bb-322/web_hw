package hw3.task5.greenhouse;


import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "visual_params")
@XmlAccessorType(XmlAccessType.FIELD)
public class VisualParams {

    @XmlElement(name = "stem_color")
    private String stemColor;

    @XmlElement(name = "leaf_color")
    private String leafColor;

    @XmlElement(name = "average_size")
    private String averageSize;

    @Override
    public String toString() {
        return "VisualParams{" +
                "stemColor='" + stemColor + '\'' +
                ", leafColor='" + leafColor + '\'' +
                ", averageSize='" + averageSize + '\'' +
                '}';
    }
}
