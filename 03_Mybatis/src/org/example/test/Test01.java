package org.example.test;

import org.example.Util.ServiceFactory;
import org.example.entity.Province;
import org.example.service.ProvinceService;
import org.example.service.impl.ProvinceServiceImpl;

import java.util.List;

public class Test01 {
    public static void main(String[] args) {
//        ProvinceService provinceService = new ProvinceServiceImpl();
        ProvinceService provinceService = (ProvinceService) ServiceFactory.getService(new ProvinceServiceImpl());
//        Province province = provinceService.getById(1);
//        System.out.println(province);
//        Province province = new Province();
//        province.setName("天津");
//        province.setJiancheng("津");
//        province.setShenghui("天津");
//        provinceService.save(province);


        List<Province> provinces = provinceService.getAll();
        for(Province province : provinces){
            System.out.println(province);
        }
        
    }

}
