package com.toyota.toyotaClone.service;

import com.toyota.toyotaClone.entity.Vehicle;

import java.util.List;

public interface VehicleService {
    List<Vehicle> getVehicles();

    void addVehicle(Vehicle vehicle);

    Vehicle getVehicle(Integer id);

    void updateVehicle(Integer id, Vehicle vehicle);

    void deleteVehicle(Integer id);
}
