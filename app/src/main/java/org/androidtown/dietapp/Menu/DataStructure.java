package org.androidtown.dietapp.Menu;

import org.androidtown.dietapp.DTO.FoodItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by azxca on 2017-10-05.
 */

public class DataStructure {
    private static DataStructure dataStructure;
    private ArrayList<FoodItem> foodList;
    private ArrayList<FoodItem> searchList;

    private DataStructure() {
        searchList=new ArrayList<FoodItem>();
    }

    public static DataStructure getInstance(){
        if(dataStructure==null)dataStructure=new DataStructure();
        return dataStructure;
    }

    public void setFoodList(ArrayList<FoodItem> foodList) {
        this.foodList = foodList;
    }

    public ArrayList<FoodItem> getFoodList() {
        return foodList;
    }

    public void sort(){
        Comparator<FoodItem> foodItemComparator=new Comparator<FoodItem>(){
            @Override
            public int compare(FoodItem o1, FoodItem o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        FoodItem[] changedArray=foodList.toArray(new FoodItem[]{});
        TimSort.sort(changedArray,foodItemComparator);
        foodList=new ArrayList<>(Arrays.asList(changedArray));
    }

    public ArrayList<FoodItem> search(String searchedString){
        searchList.clear();
        for(FoodItem item : foodList){
            if(item.getName().contains(searchedString))searchList.add(item);
        }
        return searchList;
    }

}

