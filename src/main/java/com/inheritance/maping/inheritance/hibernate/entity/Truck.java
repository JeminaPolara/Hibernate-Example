package com.inheritance.maping.inheritance.hibernate.entity;

import com.inheritance.maping.inheritance.hibernate.type.VehicleType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@NoArgsConstructor
/**
 * When use @Inheritance SINGLE_TABLE then use @DiscriminatorValue
 * */
@Getter
@Setter
@ToString
//@DiscriminatorValue(value = "Truck")
public class Truck extends Vehicle{

    private String capacity;

    public Truck(String vehicleName, String vehiclePrice, VehicleType vehicleType, String capacity) {
        super(vehicleName, vehiclePrice, vehicleType);
        this.capacity = capacity;
    }
}
