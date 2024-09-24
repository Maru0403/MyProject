package com.vti.rocket36.CarManagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name ="car")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Integer carId;
    @Column(name = "license_plate", unique = true, nullable = false)
    private String licensePlate;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "catalog")
    private String catalog;
    @Column(name = "car_maker")
    private String carMaker;

    @OneToMany(cascade = {CascadeType.REMOVE},fetch= FetchType.LAZY, mappedBy = "car")
    private Set<Accessory> accessories = new HashSet<>();
}

