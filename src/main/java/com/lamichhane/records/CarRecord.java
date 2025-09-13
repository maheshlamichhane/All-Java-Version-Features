package com.lamichhane.records;

public record CarRecord(String regNumber,String owner) {

    public static final String currentYear = "23";

    // custom canonical constructor
    public CarRecord(String regNumber,String owner){
        if(regNumber.length() <=4 ){
            throw new IllegalArgumentException();
        }
        this.regNumber = regNumber;
        this.owner = owner;
    }


    // instanc method
    public boolean isNewCar(){
        return regNumber().substring(0,2).equals(currentYear);
    }

    // static method
    public static String sayHello(){
        return "Hello";
    }


}
