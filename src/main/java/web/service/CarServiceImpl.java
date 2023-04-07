package web.service;

import org.springframework.stereotype.Service;
import web.model.CarModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private List<CarModel> carsList = new ArrayList<>();

    {
        carsList.add(new CarModel(1L, "Ford", 1997));
        carsList.add(new CarModel(1L, "Renault", 2008));
        carsList.add(new CarModel(1L, "Toyota", 2010));
        carsList.add(new CarModel(1L, "Datsun", 1995));
        carsList.add(new CarModel(1L, "Mersedes", 1967));
    }

    @Override
    public List<CarModel> getCountOfCars(int countOfCars) {
        return carsList.stream()
                .limit(countOfCars)
                .collect(Collectors.toList());
    }
}
