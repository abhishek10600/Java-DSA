import java.util.Scanner;

public class CodeFour {
     public static int findLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    
    public static int findSecondLargest(int arr[]){
        int largest = findLargest(arr);
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int secondLargest = findSecondLargest(arr);
        System.out.println(secondLargest);
        sc.close();
    }
}
