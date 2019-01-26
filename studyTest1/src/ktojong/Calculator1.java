package ktojong;

public class Calculator1 {
    public static void main(String[] args) {
        calculate(3, "+", 5);
    }

    public static void calculate(int first, String operator, int second) {
        switch (operator) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Cannot divide by 0");
                    return;
                }
                System.out.println(first / second);
                break;
        }
    }
}
