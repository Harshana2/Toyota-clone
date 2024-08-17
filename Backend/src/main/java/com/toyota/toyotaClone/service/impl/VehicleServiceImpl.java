package com.toyota.toyotaClone.service.impl;

import com.toyota.toyotaClone.entity.Vehicle;
import com.toyota.toyotaClone.repo.VehicleRepo;
import com.toyota.toyotaClone.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;

    @Override
    public List<Vehicle> getVehicles() {
        return vehicleRepo.findAll();
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicleRepo.save(vehicle);
    }

    @Override
    public Vehicle getVehicle(Integer id) {
        Vehicle vehicle = vehicleRepo
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Vehicle ID"+id));

        return vehicle;

    }

    @Override
    public void updateVehicle(Integer id, Vehicle vehicle) {
        vehicleRepo
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Vehicle ID"+id ));

        vehicle.setVehicleId(id);
        vehicleRepo.save(vehicle);
    }

    @Override
    public void deleteVehicle(Integer id) {
        Vehicle vehicle = vehicleRepo
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Vehicle ID"+id ));

        vehicleRepo.delete(vehicle);
    }
}
