package com.vti.rocket36.CarManagement.service.impl;

import com.vti.rocket36.CarManagement.entity.Accessory;
import com.vti.rocket36.CarManagement.entity.Car;
import com.vti.rocket36.CarManagement.repository.AccessoryRepository;
import com.vti.rocket36.CarManagement.service.AccessoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class AccessoryServiceImpl implements AccessoryService {
    @Autowired
    private AccessoryRepository accessoryRepository;

    @Override
    public List<Accessory> getAllAccessories() {
        return accessoryRepository.findAll();
    }

    @Override
    public Accessory createAccessory(Accessory accessory)  {
        accessory.setRepairDate(new Date());
        return accessoryRepository.save(accessory);
    }

    @Override
    public Accessory updateAccessory(Accessory accessory) {
        return accessoryRepository.save(accessory);
    }

    @Override
    public void deleteAccessory(Integer accessoryId) {
        accessoryRepository.deleteById(accessoryId);
    }

    @Override
    public List<Accessory> getAccessoryByCar(Car car) {
        return accessoryRepository.findByCar(car);
    }

    @Override
    public Accessory getAccessoryById(Integer id) {
        return accessoryRepository.findByAccessoryId(id);
    }


}
