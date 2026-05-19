package hw1.task5.greenhouse;

public class GrowingTips {
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public String getWatering() {
        return watering;
    }

    public void setWatering(String watering) {
        this.watering = watering;
    }

    private int temperature;
    private String light;
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