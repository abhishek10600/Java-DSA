public class MyCircularQueueArr {
    static class CircularQueue {
        static int arr[];
        static int size;
        static int front = -1;
        static int rear = -1;

        CircularQueue(int size) {
            this.size = size;
            arr = new int[size];
        }

        public static boolean isEmpty() {
            if (rear == -1 && front == -1) {
                return true;
            }
            return false;
        }

        public static boolean isFull() {
            if ((rear + 1) % size == front) {
                return true;
            }
            return false;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String args[]) {
        CircularQueue q = new CircularQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        System.out.println(q.remove());
        q.add(6);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
