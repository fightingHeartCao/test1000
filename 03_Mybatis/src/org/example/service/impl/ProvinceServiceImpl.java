package org.example.service.impl;

import org.example.Util.MybatisUtil;
import org.example.entity.Province;
import org.example.mapper.ProvinceMapper;
import org.example.service.ProvinceService;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {
    private ProvinceMapper provinceMapper = MybatisUtil.getSqlSession().getMapper(ProvinceMapper.class);

    @Override
    public Province getById(int id) {
        Province province = provinceMapper.selectProvince(id);
        return province;
    }

    @Override
    public void save(Province province) {
        provinceMapper.insertProvince(province);
    }

    @Override
    public List<Province> getAll() {
        return provinceMapper.getAll();
    }
}
