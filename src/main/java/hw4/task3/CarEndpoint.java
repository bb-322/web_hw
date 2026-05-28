package hw4.task3;

import hw4.task3.entity.Car;
import jakarta.jws.WebService;
import jakarta.jws.WebMethod;

import java.util.List;

@WebService
public class CarEndpoint {

    private CarService service = new CarService();

    @WebMethod
    public List<Car> getCars() {
        return service.getCars();
    }

    @WebMethod
    public Car getCar(int id) {
        return service.getCar(id);
    }

    @WebMethod
    public void addCar(Car car) {
        service.add(car);
    }

    @WebMethod
    public void deleteCar(int id) {
        service.delete(id);
    }

    @WebMethod
    public void updateCar(Car car, int id) {
        service.update(car, id);
    }
}