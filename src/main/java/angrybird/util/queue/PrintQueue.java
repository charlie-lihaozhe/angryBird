package angrybird.util.queue;

import java.util.Queue;

public class PrintQueue {
    public void printQueue(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
    }
}
