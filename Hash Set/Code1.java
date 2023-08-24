import java.util.HashSet;
import java.util.Iterator;

class Code1 {
    public static void main(String args[]) {
        HashSet<Integer> mySet = new HashSet<>();

        mySet.add(1);
        mySet.add(10);
        mySet.add(7);
        mySet.add(4);
        mySet.add(5);
        mySet.add(4);

        System.out.println(mySet);

        Iterator it = mySet.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}