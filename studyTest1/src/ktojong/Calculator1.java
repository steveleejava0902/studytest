package ktojong;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        int first, second;
        String op;
        Scanner sc = new Scanner(System.in);

        first = sc.nextInt();
        op = sc.nextLine();
        second = sc.nextInt();

        calculate(first, op, second);
    }

    public static void calculate(int f, String op, int s) {
        if ("+".equals(op)) {
            System.out.println(f + s);
        } else if ("-".equals(op)) {
            System.out.println(f - s);
        } else if ("*".equals(op)) {
            System.out.println(f * s);
        } else if ("/".equals(op)) {
            if (s == 0) {
                System.out.println("Cannot divide by 0");
                return;
            }
            System.out.println(f / s);
        }
    }
}
