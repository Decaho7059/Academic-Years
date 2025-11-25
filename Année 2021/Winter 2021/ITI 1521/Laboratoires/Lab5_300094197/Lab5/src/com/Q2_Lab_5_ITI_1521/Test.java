package com.Q2_Lab_5_ITI_1521;

public class Test {
    public static void main(String[] args){
        Employee[] employees = new Employee[4];
        employees[0] = new Contract("Alex", 25, 230.45, 30, 41);
        employees[1] = new FullTime("Dave", 50, 80, 1);
        employees[2] = new Contract("Louise", 40, 100, 40, 40);
        employees[3] = new Employee("Demi");

        for (int i = 0; i < employees.length-1; i++) {
            System.out.println(employees[i].getName()+" earns "+employees[i].getSalary());
        }
        employees[3].setSalary();
    }
}
