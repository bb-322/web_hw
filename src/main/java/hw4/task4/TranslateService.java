package hw4.task4;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TranslateService {
    private Map<String, String> dict = new HashMap<>();

    public TranslateService () {
        dict.put("кіт", "cat");
        dict.put("собака", "dog");
        dict.put("будинок", "house");
        dict.put("машина", "car");
        dict.put("яблуко", "apple");
        dict.put("книга", "book");
        dict.put("школа", "school");
        dict.put("вода", "water");
        dict.put("хліб", "bread");
        dict.put("молоко", "milk");
        dict.put("стіл", "table");
        dict.put("стілець", "chair");
        dict.put("сонце", "sun");
        dict.put("місяць", "moon");
        dict.put("день", "day");
        dict.put("ніч", "night");
        dict.put("друг", "friend");
        dict.put("робота", "work");
        dict.put("місто", "city");
        dict.put("сім'я", "family");
    }

    public String translate(String word) {
        return dict.getOrDefault(word, "unknown word");
    }
}
