package com.lamichhane.function;

import java.util.function.BiFunction;

public class EmployeeSalaryBiFunctionMain {

    public static void main(String[] args) {
        Employees e = new Employees(101,"mahesh",25);
        TimeSheet s = new TimeSheet(101,1500);

        BiFunction<Employees,TimeSheet,Double> f1 = (emp, sheet) -> emp.dailly_wage * sheet.days;
        System.out.println(f1.apply(e, s));
    }
}

class Employees {

    int eno;
    String name;
    double dailly_wage;


    public Employees(int eno, String name, double dailly_wage) {
        this.eno = eno;
        this.name = name;
        this.dailly_wage = dailly_wage;
    }



}

class TimeSheet {

    int eno;
    int days;


    public TimeSheet(int eno, int days) {
        this.eno = eno;
        this.days = days;
    }



}
