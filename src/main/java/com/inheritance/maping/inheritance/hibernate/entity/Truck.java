package com.inheritance.maping.inheritance.hibernate.entity;

import com.inheritance.maping.inheritance.hibernate.type.VehicleType;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
/**
 * When use @Inheritance SINGLE_TABLE then use @DiscriminatorValue
 * */
@DiscriminatorValue(value = "Truck")
public class Truck extends Vehicle{

    private String capacity;

    public Truck(String vehicleName, String vehiclePrice, VehicleType vehicleType, String capacity) {
        super(vehicleName, vehiclePrice, vehicleType);
        this.capacity = capacity;
    }
}
