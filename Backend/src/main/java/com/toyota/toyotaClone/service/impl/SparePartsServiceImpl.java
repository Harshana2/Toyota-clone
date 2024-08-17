package com.toyota.toyotaClone.service.impl;

import com.toyota.toyotaClone.entity.SpareParts;
import com.toyota.toyotaClone.repo.SparePartsRepo;
import com.toyota.toyotaClone.service.SparePartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SparePartsServiceImpl implements SparePartsService {

    @Autowired
    private SparePartsRepo sparePartsRepo;

    @Override
    public void addSpare(SpareParts spareParts) {
        sparePartsRepo.save(spareParts);
    }

    @Override
    public void updateSpare(Integer id, SpareParts spareParts) {
        sparePartsRepo
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Spare part ID"+id));

        spareParts.setSparePartId(id);
        sparePartsRepo.save(spareParts);
    }

    @Override
    public void deleteSpare(Integer id) {
        SpareParts spareParts = sparePartsRepo
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Spare part ID"+id ));

        sparePartsRepo.delete(spareParts);
    }

    @Override
    public List<SpareParts> getSpares() {
        return sparePartsRepo.findAll();
    }

    @Override
    public SpareParts getSpare(Integer id) {
        SpareParts spareParts = sparePartsRepo
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Spare Part ID"+id));

        return spareParts;
    }
}
