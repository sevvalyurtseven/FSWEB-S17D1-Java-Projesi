package com.workintech.s17g1.utils;

import com.workintech.s17g1.entity.Animal;

public class ValidationUtils {
    public static void checkId(Integer id){
        if(id == null || id<0){
            System.out.println("ID cannot be null or less than zero!");
        }
    }
    public static void checkAnimal(Animal animal){
        if(animal.getId() < 0){
            System.out.println("ID cannot be less than zero!");
        }
        if(animal.getName() == null || animal.getName().isEmpty()){
            System.out.println("Name null or empty!");
        }
    }
}
