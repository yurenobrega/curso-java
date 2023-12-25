package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List <Employee> employees = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            System.out.println("Employee #" + i + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employees.add(new Employee(id, name, salary));
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int selectedId = sc.nextInt();
        Integer pos = position(employees, selectedId);
        if (pos == null){
            System.out.println("This id does not exist!");
        }   else{
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employees.get(pos).salaryIncrease(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee emp : employees){
            System.out.println(emp);
        }
        sc.close();
    }
    public static Integer position(List<Employee> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
