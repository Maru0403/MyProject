package com.vti.rocket36.CarManagement.repository;

import com.vti.rocket36.CarManagement.entity.Accessory;
import com.vti.rocket36.CarManagement.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccessoryRepository extends JpaRepository<Accessory, Integer> {
    List<Accessory> findByCar(Car car);

    Accessory findByAccessoryId(Integer id);
}
