package com.toyota.toyotaClone.controller;

import com.toyota.toyotaClone.entity.SpareParts;
import com.toyota.toyotaClone.entity.Vehicle;
import com.toyota.toyotaClone.service.SparePartsService;
import com.toyota.toyotaClone.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parts")
public class SparePartsController {
    @Autowired
    private SparePartsService sparePartsService;

    @PostMapping("/add")
    public String addSpare(@RequestBody SpareParts spareParts) {
        sparePartsService.addSpare(spareParts);

        return "Spare Part Added Successfully";
    }

    @GetMapping()
    public List<SpareParts> getSpares() {
        return sparePartsService.getSpares();
    }


    @GetMapping("/get")
    public SpareParts getSpares(@RequestParam Integer id) {
        return sparePartsService.getSpare(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateSpares(@PathVariable Integer id, @RequestBody SpareParts spareParts) {
        sparePartsService.updateSpare(id, spareParts);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteSpare(@PathVariable Integer id) {
        sparePartsService.deleteSpare(id);

        return ResponseEntity.noContent().build();
    }
}
