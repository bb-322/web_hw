package hw4.task4;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class TranslateSoapEndpoint {
    private TranslateService service = new TranslateService();

    @WebMethod
    public String translate(@WebParam(name = "word") String word) {

        return service.translate(word);
    }
}
