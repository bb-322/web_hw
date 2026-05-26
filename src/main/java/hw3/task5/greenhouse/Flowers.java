package hw3.task5.greenhouse;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name = "flowers")
@XmlAccessorType(XmlAccessType.FIELD)
public class Flowers {

    @XmlElement(name = "flower")
    private List<Flower> flowerList;

    public Flowers() {
    }

    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(List<Flower> flowers) {
        this.flowerList = flowers;
    }

    @Override
    public String toString() {
        return "Flowers{" +
                "flowerList=" + flowerList +
                '}';
    }
}
