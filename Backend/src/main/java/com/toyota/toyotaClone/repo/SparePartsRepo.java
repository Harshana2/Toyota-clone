package com.toyota.toyotaClone.repo;

import com.toyota.toyotaClone.entity.SpareParts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SparePartsRepo extends JpaRepository<SpareParts,Integer> {
}
