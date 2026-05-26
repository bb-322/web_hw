package hw3.task5.greenhouse;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class MultiplyingAdapter extends XmlAdapter<String, Multiplying> {

    @Override
    public Multiplying unmarshal(String v) {
        return Multiplying.valueOf(v.toUpperCase());
    }

    @Override
    public String marshal(Multiplying v) {
        return v.name();
    }
}