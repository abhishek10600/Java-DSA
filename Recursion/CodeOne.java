import java.util.Scanner;

public class CodeOne {
    public static void printNum(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num + " ");
        printNum(num - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printNum(num);
        sc.close();
    }
}