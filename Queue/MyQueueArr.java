public class MyQueueArr {
    static class MyQueue {
        static int arr[];
        static int size;
        static int rear = -1;

        MyQueue(int size) {
            this.size = size;
            arr = new int[size];
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Full Queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String args[]) {
        MyQueue q = new MyQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        q.remove();
        q.add(4);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}