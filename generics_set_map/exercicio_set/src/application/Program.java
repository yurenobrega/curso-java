package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        Set<Integer> setC = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        addSet(setA, n, sc);
        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        addSet(setB, n, sc);
        System.out.print("How many students for course C? ");
        n = sc.nextInt();

        addSet(setC, n, sc);

        Set<Integer> total = new HashSet<>(setA);
        total.addAll(setB);
        total.addAll(setC);

        System.out.print("Total students: " + total.size());

        sc.close();
    }

    public static void addSet(Set set, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            set.add(number);
        }
    }
}
