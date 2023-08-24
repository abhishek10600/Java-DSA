// Problem to find the union of two sorted arrays

import java.util.*;

class Code1 {
    public static ArrayList<Integer> solution(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < m) {
            if (union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }
        while (j < n) {
            if (union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }

    public static void main(String args[]) {
        int arr1[] = { 1,1,1,1,1 };
        int arr2[] = { 2,2,2,2,2};

        int n = arr1.length;
        int m = arr2.length;

        ArrayList<Integer> ans = new ArrayList<>();

        ans = solution(arr1, arr2, m, n);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}