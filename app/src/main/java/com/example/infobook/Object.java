package com.example.infobook;

public class Object {
    private String order;
    private String name;
    private String description;

    public Object (String order, String name, String description){
        this.order = order;
        this.name = name;
        this.description = description;
    }
    public String getOrder(){
        return order;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
