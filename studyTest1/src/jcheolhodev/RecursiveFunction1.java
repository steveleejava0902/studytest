package jcheolhodev;

public class RecursiveFunction1 {

    public static void main(String[] args) {
        System.out.println(factor(5));
    }

    public static int factor(int num) {
        if (num == 1) {
            System.out.print(num + " = ");
            return num;
        }
        System.out.print(num + " * ");
        return num * factor(num - 1);
    }
}
