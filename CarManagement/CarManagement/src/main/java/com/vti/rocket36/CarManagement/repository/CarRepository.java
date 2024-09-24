package com.vti.rocket36.CarManagement.repository;

import com.vti.rocket36.CarManagement.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {
    public Car findByCarId(Integer carId);
}
