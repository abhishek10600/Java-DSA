import java.util.*;

public class CodeThree {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search: ");
        int key = sc.nextInt();
        int ans = linearSearch(arr, key);
        if (ans != -1) {
            System.out.println("Element found at position: " + ans);
        } else {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
