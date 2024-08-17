package com.toyota.toyotaClone.repo;

import com.toyota.toyotaClone.entity.AfterService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfterServiceRepo extends JpaRepository<AfterService,Integer> {
}
