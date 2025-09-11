package com.lamichhane.streams;

public class Cat {

    private String name,colour;
    Cat(String name,String colour){
        this.name = name;
        this.colour = colour;
    }

    @Override
    public String toString(){
        return "Cat{"+"name="+name+", colour="+colour + '}';
    }
}
