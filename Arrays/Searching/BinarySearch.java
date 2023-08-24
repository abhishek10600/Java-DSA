import java.util.*;

public class BinarySearch {
    public static int solution(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int ans = solution(arr, key);
        if (ans != -1) {
            System.out.println("Element found at position " + ans);
        } else {
            System.out.println("Element not found");
        }
    }
}