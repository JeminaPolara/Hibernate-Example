package com.inheritance.maping.inheritance.hibernate.repository;

import com.inheritance.maping.inheritance.hibernate.entity.Truck;
import com.inheritance.maping.inheritance.hibernate.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends JpaRepository<Truck, Long> {
}
