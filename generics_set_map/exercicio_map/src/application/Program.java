package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> candidates = new LinkedHashMap<>();

        System.out.print("Enter file full path: ");
        File path = new File(sc.next());

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int votes = Integer.parseInt(fields[1]);
                if (candidates.containsKey(fields[0])) {
                    candidates.put(name, candidates.get(name) + votes);
                } else {
                    candidates.put(name, votes);
                }

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}
