package hw3.task5.greenhouse;

import jakarta.xml.bind.annotation.*;


@XmlRootElement(name = "greenhouse")
@XmlAccessorType(XmlAccessType.FIELD)
public class Greenhouse {

    @XmlElement(name = "flowers")
    private Flowers flowers;

    public Flowers getFlowers() {
        return flowers;
    }

    public void setFlowers(Flowers flowers) {
        this.flowers = flowers;
    }

    public Greenhouse() {
    }

    @Override
    public String toString() {
        return "Greenhouse{" +
                "flowers=" + flowers +
                '}';
    }
}
