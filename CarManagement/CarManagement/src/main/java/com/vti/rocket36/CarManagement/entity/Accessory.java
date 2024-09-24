package com.vti.rocket36.CarManagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name ="accessory")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Accessory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accessory_id")
    private Integer accessoryId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "repair_date")
    private Date repairDate;
    @Column(name = "accessory_name")
    private String accessoryName;
    @Column(name = "price")
    private float price;
    @Column(name = "damaged_status")
    private String damagedStatus;
    @Column(name = "repair_status")
    private String repairStatus;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;
}
