import java.util.*;

public class updation {
    public static void displayArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        displayArray(arr);
        int key = sc.nextInt();
        int pos = sc.nextInt();
        arr[pos] = key;
        displayArray(arr);
        sc.close();

    }
}
