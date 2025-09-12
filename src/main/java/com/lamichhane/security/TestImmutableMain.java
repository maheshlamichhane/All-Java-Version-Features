package com.lamichhane.security;

import java.util.ArrayList;

final class Department{
    private final String name,address;
    private final int numEmployees;
    private final ArrayList<String> employee;

    private Department(String name, String address, int numEmployees, ArrayList<String> employee) {
        this.name = name;
        this.address = address;
        this.numEmployees = numEmployees;
        this.employee = employee;
    }

    public static Department createNewInstance(String name,String address,int numEmployees,ArrayList<String> employee){
        return new Department(name,address,numEmployees,employee);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public ArrayList<String> getEmployee() {
        return employee;
    }
}
public class TestImmutableMain {

    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Ann");
        employees.add("Liam");

        Department department = Department.createNewInstance("argos","Athlone",2,employees);

        String name = department.getName();
        String address = department.getAddress();
        int numEmployees = department.getNumEmployees();
        employees = department.getEmployee();

        System.out.println("Retrieved:"+name+" "+address+" "+numEmployees+" "+employees);
    }
}
