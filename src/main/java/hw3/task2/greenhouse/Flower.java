package hw3.task2.greenhouse;

public class Flower {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Soil getSoil() {
        return soil;
    }

    public void setSoil(Soil soil) {
        this.soil = soil;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public VisualParams getVisualParams() {
        return visualParams;
    }

    public void setVisualParams(VisualParams visualParams) {
        this.visualParams = visualParams;
    }

    public GrowingTips getGrowingTips() {
        return growingTips;
    }

    public void setGrowingTips(GrowingTips growingTips) {
        this.growingTips = growingTips;
    }

    public Multiplying getMultiplying() { return multiplying; }

    public void setMultiplying(Multiplying multiplying) {
        this.multiplying = multiplying;
    }

    private int id;
    private String name;
    private Soil soil;
    private String origin;
    private VisualParams visualParams;
    private GrowingTips growingTips;
    private Multiplying multiplying;

    @Override
    public String toString() {
        return "Flower{" +
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
