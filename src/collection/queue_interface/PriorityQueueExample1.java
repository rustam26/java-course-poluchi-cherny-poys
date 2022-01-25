package collection.queue_interface;

import java.util.PriorityQueue;

public class PriorityQueueExample1 {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(4);
        priorityQueue.add(8);
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(0);

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());

    }
}
