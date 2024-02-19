package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        File path = new File(sc.next());

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
            list.stream().filter(p -> p.getSalary() > salary).map(Employee::getEmail).sorted().forEach(System.out::println);
            System.out.print("Sum of salary of people whose name starts with 'M': ");
            double sumOfSalaries = list.stream().filter(p -> p.getName().startsWith("M")).map(Employee::getSalary).reduce(0.0, Double::sum);
            System.out.printf("%.2f", sumOfSalaries);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();

        // C:/temp/in.txt
    }
}
