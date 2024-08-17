package com.toyota.toyotaClone.controller;

import com.toyota.toyotaClone.entity.AfterService;
import com.toyota.toyotaClone.entity.Vehicle;
import com.toyota.toyotaClone.service.AfterSerService;
import com.toyota.toyotaClone.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/service")
public class AfterServiceController {
    @Autowired
    private AfterSerService afterSerService;

    @PostMapping("/add")
    public String addService(@RequestBody AfterService afterService) {
        afterSerService.addService(afterService);

        return "Vehicle Added Successfully";
    }

    @GetMapping()
    public List<AfterService> getService() {
        return afterSerService.getServices();
    }


    @GetMapping("/get")
    public AfterService getService(@RequestParam Integer id) {
        return afterSerService.getService(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateService(@PathVariable Integer id, @RequestBody AfterService afterService) {
        afterSerService.updateService(id, afterService);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteService(@PathVariable Integer id) {
        afterSerService.deleteService(id);

        return ResponseEntity.noContent().build();
    }
}
