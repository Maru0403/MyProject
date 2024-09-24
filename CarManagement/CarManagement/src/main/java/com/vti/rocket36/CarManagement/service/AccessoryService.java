package com.vti.rocket36.CarManagement.service;

import com.vti.rocket36.CarManagement.entity.Accessory;
import com.vti.rocket36.CarManagement.entity.Car;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;
@Service
public interface AccessoryService {
    public List<Accessory> getAllAccessories();

    public Accessory createAccessory(Accessory accessory);

    public Accessory updateAccessory(Accessory accessory);

    public void deleteAccessory(Integer accessoryId);

    public List<Accessory> getAccessoryByCar(Car car);

    public Accessory getAccessoryById(Integer id);
}
