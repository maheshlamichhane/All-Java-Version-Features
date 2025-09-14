package com.lamichhane.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeManagementMain {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<Employee>();
        populate(list);


        System.out.println("All Employee With Designation With Manager Are");
        Predicate<Employee> p1 = emp -> emp.designation.equals("Manager");
        display(p1,list);

        System.out.println("All Employee With City Bangalore Are");
        Predicate<Employee> p2 = emp -> emp.city.equals("Bangalore");
        display(p2,list);

        System.out.println("All Employee With Salary Less than 20000");
        Predicate<Employee> p3 = emp -> emp.salary < 20000;
        display(p3,list);

        System.out.println("All Employee With Manager designation and From City Bangalore");
        display(p1.and(p2),list);

        System.out.println("All Employee With designation Manager and salary less than 20000");
        display(p1.and(p3),list);

        System.out.println("All Employee With designation Manager or salary less than 20000");
        display(p1.or(p3),list);

        System.out.println("All Employee Who are not managers");
        display(p1.negate(),list);

//		Predicate<String> p = Predicate.isEqual("Mahesh Lamichhane");
//		System.out.println(p.test("Mahesh Lamichhane"));


        Predicate<Employee> pre = Predicate.isEqual(new Employee("Test","Tester",100000,"Kathmandu"));
        Employee e1 = new Employee("Test","Tester",100000,"Kathmandu");
        Employee e2 = new Employee("Demo","Demo",10000,"Pokhara");
        System.out.println(pre.test(e1));
        System.out.println(pre.test(e2));
    }


    public static void display(Predicate<Employee> pre, List<Employee> list) {

        for(Employee e : list) {
            if(pre.test(e)) {
                System.out.println(e);
            }
        }
    }

    public static void populate(List<Employee> list) {
        list.add(new Employee("Durga","CEO",30000,"Hyderabad"));
        list.add(new Employee("Sunny","Manager",2000,"Hyderabad"));
        list.add(new Employee("Mallika","Manager",20000,"Bangalore"));
        list.add(new Employee("Kareena","Lead",15000,"Hyderabad"));
        list.add(new Employee("Katring","Lead",15000,"Bangalore"));
        list.add(new Employee("Anushka","Developer",10000,"Hyderabad"));
        list.add(new Employee("kanushka","Developer",10000,"Hyderabad"));
        list.add(new Employee("Sowmya","Developer",10000,"Bangalore"));
        list.add(new Employee("Ramya","Developer",10000,"Bangalore"));
    }

}

class Employee {

    String name;
    String designation;
    double salary;
    String city;


    public Employee() {
    }


    public Employee(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }


    @Override
    public String toString() {
        return "[name=" + name + ", designation=" + designation + ", salary=" + salary + ", city=" + city
                + "]";
    }
}
