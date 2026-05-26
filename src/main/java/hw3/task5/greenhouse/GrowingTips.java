package hw3.task5.greenhouse;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "growing_tips")
@XmlAccessorType(XmlAccessType.FIELD)
public class GrowingTips {

    @XmlElement
    private int temperature;

    @XmlElement
    private String light;

    @XmlElement
    private String watering;

    @Override
    public String toString() {
        return "GrowingTips{" +
                "temperature=" + temperature +
                ", light='" + light + '\'' +
                ", watering='" + watering + '\'' +
                '}';
    }
}