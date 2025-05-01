package com.statickeyword;


public class Employee {
    static String company = "TechCorp"; // Shared among all instances
    String name;
    
    Employee(String name) {
        this.name = name;
    }
    
    void display() {
        System.out.println(name + " works at " + company);
    }



    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob");
        
        emp1.display(); // Output: Alice works at TechCorp
        emp2.display(); // Output: Bob works at TechCorp
    }
}
