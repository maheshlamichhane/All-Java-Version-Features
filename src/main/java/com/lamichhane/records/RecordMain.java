package com.lamichhane.records;

public class RecordMain {

    public static void main(String[] args) {

        // using regular class
        Car car = new Car("434344","Joe Bloggs");
        System.out.println(car);
        System.out.println(car.getOwner());
        System.out.println(car.getRegNumber());

        CarRecord record = new CarRecord("4344334","Mary Bloggs");
        System.out.println(record);
        System.out.println(record.owner());
        System.out.println(record.regNumber());

        System.out.println(CarRecord.currentYear);
        System.out.println(record.isNewCar());
        System.out.println(CarRecord.sayHello());
    }


}
