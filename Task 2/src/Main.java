import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        addNumber();
    }

    private static void addNumber() {
        System.out.println(checksNumber() % 2 == 0);
    }

    private static int checksNumber() {
        System.out.println("ведите число: ");
        return new Scanner(System.in).nextInt();
    }
}