package com.inheritance.maping.inheritance.hibernate.entity;

import com.inheritance.maping.inheritance.hibernate.model.CarDto;
import com.inheritance.maping.inheritance.hibernate.type.VehicleType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
/**
 * When use @Inheritance SINGLE_TABLE then use @DiscriminatorValue
 * */
//@DiscriminatorValue(value = "CAR")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Car extends Vehicle {

    public int noOfSeats;

    public Car(String vehicleName, String vehiclePrice, VehicleType vehicleType, int noOfSeats) {
        super(vehicleName, vehiclePrice, vehicleType);
        this.noOfSeats = noOfSeats;
    }

    public static CarDto from(Car car) {
        CarDto carDto = new CarDto();
        carDto.setId(car.getVehicleId());
        carDto.setName(car.getVehicleName());
        carDto.setNoOfSeat(car.getNoOfSeats());
        carDto.setPrice(car.getVehiclePrice());
        carDto.setType(car.getVehicleType());
        return carDto;
    }

}
