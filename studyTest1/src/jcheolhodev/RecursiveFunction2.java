package jcheolhodev;

public class RecursiveFunction2 {

    public static void main(String[] args) {
        System.out.println(throwingDIce());
    }
    public static int throwingDIce() {
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;

        System.out.println("dice1: " + dice1);
        System.out.println("dice2: " + dice2);

        int sum = dice1 + dice2;

        if (dice1 == dice2) {
            System.out.println("double");
            return sum + throwingDIce();
        }

        System.out.println("sum: " + sum);
        return sum;
    }
}
