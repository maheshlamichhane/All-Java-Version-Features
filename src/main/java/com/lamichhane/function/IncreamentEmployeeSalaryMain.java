package com.lamichhane.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class IncreamentEmployeeSalaryMain {

    public static void populate(List<Employee> list) {
        list.add(new Employee("Mahesh",10000));
        list.add(new Employee("Pits",15000));
        list.add(new Employee("Sagar",20000));
        list.add(new Employee("Kamal",25000));
        list.add(new Employee("Nabin",30000));
    }

    public static void main(String[] args) {

        List<Employee> mylist = new ArrayList<>();
        populate(mylist);

        Predicate<Double> mypredicate = val -> val < 20000;

        Function<Double,Double> f1 = sal -> {
            return sal + 3000;
        };

        List<Employee> newList = new ArrayList<>();

        for(Employee e : mylist) {

            if(mypredicate.test(e.salary))
            {
                double new_salary = f1.apply(e.salary);
                Employee newEmployee = new Employee(e.name,new_salary);
                newList.add(newEmployee);
            }

        }

        System.out.println("Before Salary Increament");
        System.out.println(mylist);

        System.out.println("Employees Who's  Salary Increamented");
        System.out.println(newList);


    }

}

class Employee {

    String name;
    double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }




}
