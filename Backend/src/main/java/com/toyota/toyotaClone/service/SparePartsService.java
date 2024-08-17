package com.toyota.toyotaClone.service;

import com.toyota.toyotaClone.entity.SpareParts;
import com.toyota.toyotaClone.entity.Vehicle;

import java.util.List;

public interface SparePartsService {
    void addSpare(SpareParts spareParts);
    

    void updateSpare(Integer id, SpareParts spareParts);

    void deleteSpare(Integer id);

    List<SpareParts> getSpares();

    SpareParts getSpare(Integer id);
}
