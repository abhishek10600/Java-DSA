import java.util.ArrayList;

public class Code2 {
    public static ArrayList<Integer> solution(int arr1[], int arr2[], int m, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr1[] = { 1, 2, 2, 3, 3, 4, 5, 6 };
        int arr2[] = { 2, 3, 3, 5, 6, 6, 7 };

        int m = arr1.length;
        int n = arr2.length;

        ArrayList<Integer> ans = new ArrayList<>();

        ans = solution(arr1, arr2, m, n);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
