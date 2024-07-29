package com.java.interviewprep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class ListItems {

    private Integer id;
    private String name;

    public ListItems(Integer id, String name)
    {

        // assigning the value of key and value
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[]args) {
        List<ListItems> list = new ArrayList<>();
        list.add(new ListItems(1, "Vishak"));
        list.add(new ListItems(2, "Vivek"));
        list.add(new ListItems(3, "Anu"));
        list.add(new ListItems(4, "Gowri"));
        list.add(new ListItems(5, "Anagha"));

        Map<Integer, String> mapValues = new HashMap<>();

        list.forEach(
                (n) -> mapValues.put(n.getId(), n.getName())
        );
        System.out.println("Map : " + mapValues);
    }

}
