package hw4.task3;

import jakarta.xml.ws.Endpoint;

public class Main {
    static void main() {
        Endpoint.publish("http://localhost:8080/car", new CarEndpoint());
    }
}