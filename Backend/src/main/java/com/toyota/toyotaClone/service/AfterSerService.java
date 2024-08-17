package com.toyota.toyotaClone.service;

import com.toyota.toyotaClone.entity.AfterService;

import java.util.List;

public interface AfterSerService {
    void addService(AfterService afterService);

    List<AfterService> getServices();

    AfterService getService(Integer id);

    void updateService(Integer id, AfterService afterService);

    void deleteService(Integer id);
}
