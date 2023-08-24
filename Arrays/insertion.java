import java.util.*;

public class insertion {
    public static void displayArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int pos = sc.nextInt();
        for (int i = size - 1; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = key;
        displayArray(arr);
        sc.close();
    }
}
