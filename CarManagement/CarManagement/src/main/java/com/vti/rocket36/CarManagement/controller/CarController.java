package com.vti.rocket36.CarManagement.controller;

import com.vti.rocket36.CarManagement.entity.Car;
import com.vti.rocket36.CarManagement.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/car/getAll")
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

    @GetMapping(value = "/car/getCarById/{carId}")
    public Car getCarById(@PathVariable Integer carId) {
        return carService.getCarById(carId);
    }

    @PostMapping(value = "/car/createCar")
    public Car createCar(@RequestBody Car car) {
        return carService.createCar(car);
    }

    @PutMapping(value = "/car/updateCar")
    public Car updateCar(@RequestBody Car car) {
        return carService.updateCar(car);
    }

    @DeleteMapping(value = "/car/deleteCar/{carId}")
    public void deleteCar(@PathVariable Integer carId) {
        carService.deleteCar(carId);
    }
}
