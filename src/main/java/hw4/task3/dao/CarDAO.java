package hw4.task3.dao;
import hw4.task3.entity.Car;

import java.util.List;

public interface CarDAO {
    void add(Car car);
    List<Car> getAll();
    Car getById(int id);
    void deleteById(int id);
    void update(Car car, int id);
}
