import java.util.Scanner;

public class CodeTwo {
    public static int calcFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        int factorial = num * calcFactorial(num - 1);
        return factorial;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = calcFactorial(num);
        System.out.println(ans);
        sc.close();
    }
}
