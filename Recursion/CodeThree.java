import java.util.Scanner;

public class CodeThree {
    public static void fibonacci(int prev, int curr, int num) {
        if (num == 0) {
            return;
        }
        int next = prev + curr;
        System.out.print(next + " ");
        fibonacci(curr, next, num - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(0 + " ");
        System.out.print(1 + " ");
        fibonacci(0, 1, num - 2);
        sc.close();
    }
}
