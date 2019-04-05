package com.xuxueli.poi.excel;

import com.xuxueli.poi.excel.entity.Dog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:/Users/Liushang/Desktop/dog.xlsx";
        List<Dog> shopDTOList = new ArrayList<Dog>();
        for (int i = 0; i < 10; i++) {
            Dog shop = new Dog();
            shop.setNumber("ID:"+i);
            shop.setName("jsfsa"+i);
            shop.setAge(2+i);
            shop.setHealthCode("健康证:"+i+"JKZ");
            shop.setWeight(1000+i);
            shop.setBirthday(new Date());
            shopDTOList.add(shop);
        }

        ExcelExportUtil.exportToFile(filePath, shopDTOList);

        List<Object> list =ExcelImportUtil.importExcel(filePath, Dog.class);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
