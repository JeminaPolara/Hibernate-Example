package com.inheritance.maping.inheritance.hibernate.entity;

import com.inheritance.maping.inheritance.hibernate.type.VehicleType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
/**
 * When use SINGLE_TABLE then use @DiscriminatorColumn and comment abstract keyword
 * */
//@DiscriminatorColumn(name = "VEHICLE_TYPES", discriminatorType = DiscriminatorType.STRING)
@NoArgsConstructor
@Getter
@Setter
@ToString
public abstract class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vehicleId;

    private String vehicleName;

    private String vehiclePrice;

    @Enumerated(value = EnumType.ORDINAL)
    private VehicleType vehicleType;


    public Vehicle(String vehicleName, String vehiclePrice, VehicleType vehicleType) {
        this.vehicleName = vehicleName;
        this.vehiclePrice = vehiclePrice;
        this.vehicleType = vehicleType;
    }

}
