import java.util.*;

public class Code1 {
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();

        // Inserting element in ArrayList
        arr.add(1);
        arr.add(7);
        arr.add(9);
        arr.add(2);

        System.out.println(arr);

        // Get elements in Java
        int element = arr.get(1);
        System.out.println(element);

        // Insert elements in between the ArrayList
        arr.add(1, 6);

        System.out.println(arr);

        // Update an element in ArrayList
        arr.set(0, 7);
        System.out.println(arr);

        // delete element in ArrayList
        arr.remove(3);
        System.out.println(arr);

        int size = arr.size();
        System.out.println(size);

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        // sorting elements in ArrayList
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(100);
        arr2.add(50);
        arr2.add(25);
        arr2.add(700);

        System.out.println(arr2);

        // This is used to sort ArrayList
        Collections.sort(arr2);
        System.out.println(arr2);
    }
}