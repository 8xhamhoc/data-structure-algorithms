package org.quangphan.data.structure.algorithms;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(3);
        queue.offer(4);
        queue.offer(1);
        queue.offer(6);
        queue.offer(7);
        queue.offer(2);

        while (!queue.isEmpty()) {
            System.out.println("number: " + queue.poll());
        }
    }
}
