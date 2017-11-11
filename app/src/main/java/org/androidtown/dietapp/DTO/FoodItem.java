package org.androidtown.dietapp.DTO;

import android.support.annotation.NonNull;

/**
 * Created by latitude7275 on 2017-09-14.
 */

public class FoodItem implements Comparable<FoodItem>{
    public String category;
    public String name;
    public int calorie;
    public int fat;
    public int carbohydrate;
    public int protein;
    public String uid;
    public int frequency;

    public FoodItem() {
        setFrequency(0);
    }

    public FoodItem(String uid,String category, String name,int calorie, int carbohydrate, int protein, int fat) {
        this.uid=uid;
        this.category = category;
        this.name = name;
        this.fat = fat;
        this.carbohydrate = carbohydrate;
        this.protein = protein;
        this.calorie = calorie;
    }

    @Override
    public int compareTo(@NonNull FoodItem o) {
        return o.getName().compareTo(this.name);
    }

    //getter setter start

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public String getUid()
    {
        return uid;
    }

    public void setUid(String uid)
    {
        this.uid=uid;
    }

    public void setFrequency(int Frequency){ this.frequency = Frequency; }

    public int getFrequency(){ return frequency; }

    public void plusFrequency(){ setFrequency(getFrequency()+1);}

    //getter setter end

}
