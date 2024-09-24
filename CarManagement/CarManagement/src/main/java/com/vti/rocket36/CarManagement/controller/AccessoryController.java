package com.vti.rocket36.CarManagement.controller;

import com.vti.rocket36.CarManagement.entity.Accessory;
import com.vti.rocket36.CarManagement.service.AccessoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccessoryController {
    @Autowired
    private AccessoryService accessoryService;

    @GetMapping(value = "/accessory/getAll")
    public List<Accessory> getAllAccessories() {
        return accessoryService.getAllAccessories();
    }

    @PostMapping(value = "/accessory/createAccessory")
    public Accessory createAccessory(@RequestBody Accessory accessory) {
        return accessoryService.createAccessory(accessory);
    }

    @PutMapping(value = "/accessory/updateAccessory")
    public Accessory updateAccessory(@RequestBody Accessory accessory) {
        return accessoryService.updateAccessory(accessory);
    }

    @DeleteMapping(value = "/accessory/deleteAccessory/{accessoryId}")
    public void deleteAccessory(@PathVariable Integer accessoryId) {
         accessoryService.deleteAccessory(accessoryId);
    }
}
