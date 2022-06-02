package com.inheritance.maping.inheritance.hibernate;

import com.inheritance.maping.inheritance.hibernate.entity.Car;
import com.inheritance.maping.inheritance.hibernate.entity.Truck;
import com.inheritance.maping.inheritance.hibernate.repository.CarRepository;
import com.inheritance.maping.inheritance.hibernate.repository.TruckRepository;
import com.inheritance.maping.inheritance.hibernate.type.VehicleType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class InheritanceHibernateApplication {

//    @Autowired
//    CarRepository carRepository;
//    @Autowired
//    TruckRepository truckRepository;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(InheritanceHibernateApplication.class, args);


//        VehicleRepository vehicleRepository = context.getBean(VehicleRepository.class);
        CarRepository carRepository = context.getBean(CarRepository.class);
        TruckRepository truckRepository = context.getBean(TruckRepository.class);

        Car car = new Car("i10", "7lac", VehicleType.CAR, 5);
        carRepository.save(car);

        Truck truck = new Truck("Eicher", "10Lac", VehicleType.TRUCK, "1000");
        truckRepository.save(truck);

//        Vehicle vehicle = new Vehicle("i10", "7lac", VehicleType.CAR);
//        Vehicle vehicle1 = new Vehicle("Eicher", "10Lac", VehicleType.TRUCK);
//
//        vehicleRepository.save(vehicle);
//        vehicleRepository.save(vehicle1);
    }

}
