package application;

public class Program2 {
        public static void main(String[] args) {
            int x = 20;

            // wrapper class
            Integer obj = x;

            System.out.println(obj);

            // não precisa converter para int
            int y = obj * 2;

            System.out.println(y);
        }
    }

