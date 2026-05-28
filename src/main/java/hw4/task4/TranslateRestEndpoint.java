package hw4.task4;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TranslateRestEndpoint {

    private final TranslateService service;

    public TranslateRestEndpoint(TranslateService service) {
        this.service = service;
    }

    @GetMapping("/translate")
    public String translate(@RequestParam("word") String word) {
        return service.translate(word);
    }
}