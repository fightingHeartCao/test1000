package org.example.mapper;

import org.example.entity.Province;

import java.util.List;

public interface ProvinceMapper {
    Province selectProvince(int id);
    void insertProvince(Province province);
    List<Province> getAll();
}
