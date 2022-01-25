package collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Rustam");
        queue.offer("Oleg");
        queue.offer("Ivan");
        queue.offer("Any");
        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.peek());


    }
}
