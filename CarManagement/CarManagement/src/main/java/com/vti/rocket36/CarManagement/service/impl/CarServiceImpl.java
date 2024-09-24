package com.vti.rocket36.CarManagement.service.impl;

import com.vti.rocket36.CarManagement.entity.Car;
import com.vti.rocket36.CarManagement.repository.CarRepository;
import com.vti.rocket36.CarManagement.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(Integer carId) {
        return carRepository.findByCarId(carId);
    }

    @Override
    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car updateCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void deleteCar(Integer carId) {
        carRepository.deleteById(carId);
    }
}
