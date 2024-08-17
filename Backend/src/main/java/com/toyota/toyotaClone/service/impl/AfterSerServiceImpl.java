package com.toyota.toyotaClone.service.impl;

import com.toyota.toyotaClone.entity.AfterService;
import com.toyota.toyotaClone.repo.AfterServiceRepo;
import com.toyota.toyotaClone.service.AfterSerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AfterSerServiceImpl implements AfterSerService {

    @Autowired
    private AfterServiceRepo afterServiceRepo;
    @Override
    public void addService(AfterService afterService) {
        afterServiceRepo.save(afterService);
    }

    @Override
    public List<AfterService> getServices() {
        return afterServiceRepo.findAll();
    }

    @Override
    public AfterService getService(Integer id) {
        AfterService afterService = afterServiceRepo
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Service ID"+id));

        return afterService;
    }

    @Override
    public void updateService(Integer id, AfterService afterService) {
        afterServiceRepo
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Service ID"+id));

        afterService.setServiceId(id);
        afterServiceRepo.save(afterService);
    }

    @Override
    public void deleteService(Integer id) {
        AfterService afterService = afterServiceRepo
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Service ID"+id ));

        afterServiceRepo.delete(afterService);
    }
}
