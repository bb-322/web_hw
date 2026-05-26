package hw3.task5.greenhouse;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class SoilAdapter extends XmlAdapter<String, Soil> {

    @Override
    public Soil unmarshal(String v) {
        return Soil.valueOf(v.toUpperCase());
    }

    @Override
    public String marshal(Soil v) {
        return v.name();
    }
}