import java.util.*;

public class CodeTwo {
    public static int addTwoNumbers(int a, int b) {
        int ans = a + b;
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();
        int solution = addTwoNumbers(num1, num2);
        System.out.println("Result: " + solution);
    }
}