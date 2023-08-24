import java.util.*;

public class KadaneAlgo {

    public static int kadane(int arr[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (sum > maxSum) {
                maxSum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = kadane(arr);

        System.out.println(ans);

        sc.close();
    }
}