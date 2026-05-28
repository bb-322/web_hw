package hw4.task3;

import hw4.task3.dao.CarJDBCDAO;
import hw4.task3.entity.Car;

import java.util.List;

public class CarService {
    private CarJDBCDAO dao = new CarJDBCDAO();

    public List<Car> getCars() {
        return dao.getAll();
    }

    public void add(Car car) {
        dao.add(car);
    }

    public Car getCar(int id) {
        return dao.getById(id);
    }

    public void delete(int id) {
        dao.deleteById(id);
    }

    public void update(Car car, int id) {
        dao.update(car, id);
    }

}
