package com.inheritance.maping.inheritance.hibernate.model;

import com.inheritance.maping.inheritance.hibernate.type.VehicleType;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CarDto {

    public Long id;
    public String name;
    public String price;
    public VehicleType type;
    public int noOfSeat;


}
