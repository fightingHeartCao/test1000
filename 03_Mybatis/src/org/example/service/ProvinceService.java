package org.example.service;

import org.example.entity.Province;

import java.util.List;

public interface ProvinceService {
    Province getById(int id);
    void save(Province province);
    List<Province> getAll();
}
