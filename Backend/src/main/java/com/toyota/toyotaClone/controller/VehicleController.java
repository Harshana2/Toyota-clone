package com.toyota.toyotaClone.controller;

import com.toyota.toyotaClone.entity.Vehicle;
import com.toyota.toyotaClone.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/add")
    public String addVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.addVehicle(vehicle);

        return "Vehicle Added Successfully";
    }

    @GetMapping()
    public List<Vehicle> getVehicles() {
        return vehicleService.getVehicles();
    }


    @GetMapping("/get")
    public Vehicle getVehicle(@RequestParam Integer id) {
        return vehicleService.getVehicle(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateVehicle(@PathVariable Integer id, @RequestBody Vehicle vehicle) {
        vehicleService.updateVehicle(id, vehicle);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteVehicle(@PathVariable Integer id) {
        vehicleService.deleteVehicle(id);

        return ResponseEntity.noContent().build();
    }
}
