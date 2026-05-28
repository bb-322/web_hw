package hw4.task2;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class Main {
    static void main() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Object>> mapList = mapper.readValue(response.body(),
                new TypeReference<List<Map<String, Object>>>() {});

        for (Map<String, Object> el : mapList) {
            switch ((String) el.get("cc")) {
                case "GBP":
                    System.out.println("GPB: rate = " + el.get("rate"));
                    break;

                case "USD":
                    System.out.println("USD: rate = " + el.get("rate"));
                    break;

                case "EUR":
                    System.out.println("EUR: rate = " + el.get("rate"));
                    break;
            }
        }

    }
}
