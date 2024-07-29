package com.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;
    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public boolean isVegetarian() {
        return vegetarian;
    }
    public int getCalories() {
        return calories;
    }
    public Type getType() {
        return type;
    }
    @Override
    public String toString() {
        return name;
    }
    public enum Type { MEAT, FISH, OTHER }

    public static void main(String[]args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );

       List<String> threeHighCaloricDishNames =  menu.stream().filter(dish->dish.getCalories() > 320).sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName).limit(3).collect(Collectors.toList());

       System.out.println("threeHighCaloricDishNames:::"+threeHighCaloricDishNames);

        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("muscle", false, 800, Dish.Type.FISH),
                new Dish("scallops", false, 900, Dish.Type.FISH),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER));

       //List<Dish> filteredMenu = specialMenu.stream().filter(Dish::isVegetarian).collect(Collectors.toList());
        long startTime = System.currentTimeMillis();
        List<Dish> filteredMenu = specialMenu.stream().filter(dish->dish.getCalories() < 320).collect(Collectors.toList());
        long endTime = System.currentTimeMillis()-startTime;
        System.out.println("Filtered Menu::"+filteredMenu);
        System.out.println("Time Taken while filtering::"+endTime);

        List<Dish> slicedMenu1 = specialMenu.stream().takeWhile(dish -> dish.getCalories()<800).collect(Collectors.toList());
        System.out.println("Sliced Menu::"+slicedMenu1); //This will break as it finds condition satisfied.

        /*If you are using takeWhile sort the data and fetch the data.*/
        List<Dish> siledMenu2 = specialMenu.stream().sorted(Comparator.comparing(Dish::getCalories))
                .takeWhile(dish -> dish.getCalories() < 800).collect(Collectors.toList());
        System.out.println("Sliced Menu::"+siledMenu2);

       List<Dish> sortedList =  specialMenu.stream().sorted(Comparator.comparing(Dish::getCalories)).collect(Collectors.toList());

        System.out.println("Sliced Menu::"+sortedList);

    }
}
