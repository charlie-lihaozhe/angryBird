package angrybird.util.queue;

import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueDemo {
    public void priorityQueue() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(rand.nextInt(10));
        }

        PrintQueue printQueue = new PrintQueue();
        printQueue.printQueue(priorityQueue);
    }

}
