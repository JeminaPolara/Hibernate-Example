package com.inheritance.maping.inheritance.hibernate.repository;

import com.inheritance.maping.inheritance.hibernate.entity.Car;
import com.inheritance.maping.inheritance.hibernate.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends VehicleRepository/*JpaRepository<Car,Long>*/ {
}
