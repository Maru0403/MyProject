package com.vti.rocket36.CarManagement.controller;

import com.vti.rocket36.CarManagement.entity.Accessory;
import com.vti.rocket36.CarManagement.entity.Car;
import com.vti.rocket36.CarManagement.service.AccessoryService;
import com.vti.rocket36.CarManagement.service.CarService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class WebController {
    @Autowired
    private CarService carService;

    @Autowired
    private AccessoryService accessoryService;

    @GetMapping("/home")
    public String loadHomePage() {
        return "home";
    }

    @GetMapping("/car")
    public String getAllAccount(Model model) {
        model.addAttribute("listCars", carService.getAllCars());
        return "car";
    }

    @GetMapping("/showNewCarForm")
    public String showNewCarForm(Model model) {
        // create model attribute to bind form data
        Car car = new Car();
        model.addAttribute("car", car);
        return "new_car";
    }
    // khi có @ModelAttribute => vác dữ liệu được nhập vào từ trên giao diện vào database
    // nếu ko có => lấy dữ liệu từ database mang lên hiển thị trên giao diện

    @PostMapping("/createCar")
    public String saveEmployee(@ModelAttribute("car") Car car) {
        // save car to database
        carService.createCar(car);
        return "/home";
    }

    @GetMapping("/showAccessoryDetail/{id}")
    public String showAccessoryDetail(@PathVariable(value = "id") Integer id, Model model) {
        // create model attribute to bind form data
        Car car = carService.getCarById(id);
        model.addAttribute("listAccessories", accessoryService.getAccessoryByCar(car));
        return "accessory_detail";
    }

    @GetMapping("/showEditAccessoryDetailForm/{id}")
    public String showEditAccessoryDetailForm(@PathVariable(value = "id") Integer id, Model model) {
        // create model attribute to bind form data

        Accessory accessory = accessoryService.getAccessoryById(id);
        model.addAttribute("accessory", accessory);
        return "edit_accessory_detail";
    }

    @PostMapping("/saveAccessoryDetail")
    public String saveAccessoryDetail(@ModelAttribute("accessory") Accessory accessoryDto, Model model) {
        // save car to database
        Accessory accessory = accessoryService.getAccessoryById(accessoryDto.getAccessoryId());
        BeanUtils.copyProperties(accessoryDto,accessory,"car", "repairDate");
        accessoryService.updateAccessory(accessory);

        model.addAttribute("listAccessories", accessoryService.getAccessoryByCar(accessory.getCar()));
        return "/accessory_detail";
    }

    @GetMapping("/deleteAccessoryDetail/{id}")
    public String deleteAccessoryDetail(@PathVariable(value = "id") Integer id, Model model)
    {
        // save car to database
        Accessory accessory = accessoryService.getAccessoryById(id);
        accessoryService.deleteAccessory(id);
        model.addAttribute("listAccessories", accessoryService.getAccessoryByCar(accessory.getCar()));
        return "/accessory_detail";
    }
}
