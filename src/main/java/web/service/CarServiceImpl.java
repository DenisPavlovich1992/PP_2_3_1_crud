package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("Audi", "Black", 2019),
            new Car("BMW", "White", 2020),
            new Car("Mercedes", "Red", 2018),
            new Car("Toyota", "Blue", 2017),
            new Car("Nissan", "Green", 2016)
    );

    @Override
    public List<Car> getCars(int count) {
        int actualCount = Math.min(count, cars.size());
        return cars.subList(0, actualCount);
    }
}
