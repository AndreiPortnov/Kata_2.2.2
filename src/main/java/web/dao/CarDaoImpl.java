package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao{
    private final List<Car> carsList = new ArrayList<>();

    {
        carsList.add(new Car(1L, "Ford", 1997));
        carsList.add(new Car(1L, "Renault", 2008));
        carsList.add(new Car(1L, "Toyota", 2010));
        carsList.add(new Car(1L, "Datsun", 1995));
        carsList.add(new Car(1L, "Mersedes", 1967));
    }

    public List<Car> showCountOfCars(int countOfCars) {
        return carsList.stream()
                .limit(countOfCars)
                .collect(Collectors.toList());
    }
}
