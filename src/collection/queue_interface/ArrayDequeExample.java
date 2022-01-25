package collection.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.addFirst(3);
        arrayDeque.addFirst(5);
        arrayDeque.addLast(7);
        arrayDeque.offerFirst(1);
        arrayDeque.offerLast(8);
        System.out.println(arrayDeque);

        System.out.println(arrayDeque.removeFirst());
        System.out.println(arrayDeque.removeLast());
        System.out.println(arrayDeque.pollFirst());
        System.out.println(arrayDeque.pollLast());
    }
}
