package application;

public class Program {
    public static void main(String[] args) {
        int x = 20;

        // boxing = valor -> objeto
        Object obj = x;

        System.out.println(obj);

        //unboxing = objeto -> valor
        int y = (int) obj;

        System.out.println(y);
    }
}
