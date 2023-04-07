package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.CarModel;
import web.service.CarService;

import java.util.List;

@Controller
public class SecondController {

    private CarService carService;

    @Autowired
    public SecondController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<CarModel> carsList = carService.getCountOfCars(count);
        model.addAttribute("list", carsList);
        return "car_index";
    }
}
