package com.inheritance.maping.inheritance.hibernate;

import com.inheritance.maping.inheritance.hibernate.entity.Car;
import com.inheritance.maping.inheritance.hibernate.entity.Truck;
import com.inheritance.maping.inheritance.hibernate.entity.Vehicle;
import com.inheritance.maping.inheritance.hibernate.repository.CarRepository;
import com.inheritance.maping.inheritance.hibernate.repository.TruckRepository;
import com.inheritance.maping.inheritance.hibernate.repository.VehicleRepository;
import com.inheritance.maping.inheritance.hibernate.type.VehicleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

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
        /*TruckRepository truckRepository = context.getBean(TruckRepository.class);

        Car car1 = new Car("BMW", "10lac", VehicleType.CAR, 5);
        carRepository.save(car1);*/

//        Truck truck = new Truck("Benz", "10Lac", VehicleType.TRUCK, "1200");
//        truckRepository.save(truck);

        List<Car> vehicleList = carRepository.findAll();
        vehicleList.forEach(car -> {
            System.out.println(Car.from(car));
        });
        //vehicleList.stream().filter(vehicle -> vehicle.getVehicleId().equals(2L)).forEach(vehicle -> System.out.println("Specific Vehicle==" + vehicle.));
        /*Vehicle vehicle = new Vehicle("i10", "7lac", VehicleType.CAR);
        Vehicle vehicle1 = new Vehicle("Eicher", "10Lac", VehicleType.TRUCK);

        vehicleRepository.save(vehicle);
        vehicleRepository.save(vehicle1);*/
    }

}
