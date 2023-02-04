package com.inheritance.maping.inheritance.hibernate.repository;

import com.inheritance.maping.inheritance.hibernate.entity.Vehicle;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

/**
 * When use @Inheritance TABLE_PER_CLASS then use @Primary
 * */
//@Repository
//@Primary
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
