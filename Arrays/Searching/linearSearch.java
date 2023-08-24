import java.util.*;

public class linearSearch {
    public static int Lsearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
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
        int ans = Lsearch(arr, key);
        if (ans != -1) {
            System.out.println(ans);
        } else {
            System.out.println("Element does not exist");
        }
        sc.close();
    }
}