package com.vti.rocket36.CarManagement.service;

import com.vti.rocket36.CarManagement.entity.Car;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CarService {
    public List<Car> getAllCars();

    public Car getCarById(Integer carId);

    public Car createCar(Car car);

    public Car updateCar(Car car);

    public void deleteCar(Integer carId);
}
