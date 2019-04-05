package com.xuxueli.poi.excel.entity;

import com.xuxueli.poi.excel.annotation.ExcelField;
import com.xuxueli.poi.excel.annotation.ExcelSheet;
import org.apache.poi.hssf.util.HSSFColor;
import java.util.Date;
@ExcelSheet(name="狗狗实体类",headColor = HSSFColor.HSSFColorPredefined.LIGHT_GREEN)
public class Dog {
    @ExcelField(name="编号")
    private String number;
    @ExcelField(name="名称")
    private String name;
    @ExcelField(name="年龄")
    private int age;
    @ExcelField(name="生日",dateformat = "yyyy-MM-dd")
    private Date birthday;
    @ExcelField(name="健康证")
    private String healthCode;
    @ExcelField(name="体重")
    private float weight;

    public Dog(){

    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHealthCode() {
        return healthCode;
    }

    public void setHealthCode(String healthCode) {
        this.healthCode = healthCode;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }




    public Dog(String number, String name, int age, Date birthday, String healthCode, float weight) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.healthCode = healthCode;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", healthCode='" + healthCode + '\'' +
                ", weight=" + weight +
                '}';
    }
}
