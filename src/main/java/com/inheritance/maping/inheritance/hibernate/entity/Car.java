package com.inheritance.maping.inheritance.hibernate.entity;

import com.inheritance.maping.inheritance.hibernate.type.VehicleType;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
/**
 * When use @Inheritance SINGLE_TABLE then use @DiscriminatorValue
 * */
@DiscriminatorValue(value = "CAR")
@NoArgsConstructor
public class Car extends Vehicle{

    private int noOfSeats;

    public Car(String vehicleName, String vehiclePrice, VehicleType vehicleType, int noOfSeats) {
        super(vehicleName, vehiclePrice, vehicleType);
        this.noOfSeats = noOfSeats;
    }

}
