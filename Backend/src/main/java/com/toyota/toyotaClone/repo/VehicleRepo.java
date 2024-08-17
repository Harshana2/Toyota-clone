package com.toyota.toyotaClone.repo;

import com.toyota.toyotaClone.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle,Integer> {
}
