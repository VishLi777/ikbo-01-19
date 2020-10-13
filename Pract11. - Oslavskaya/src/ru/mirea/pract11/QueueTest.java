package ru.mirea.pract11;
import java.util.ArrayList;
import java.util.Arrays;


public class QueueTest {
    public static void main(String[] args) {
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(48, 56, 92, 35, 67));
        linkedQueue.addAll(arrayList);
        linkedQueue.offer(7);
        linkedQueue.offer(6);
        linkedQueue.offer(5);
        linkedQueue.offer(4);
        linkedQueue.offer(3);
        linkedQueue.offer(2);
        linkedQueue.offer(1);
        System.out.println("Linked Queue");
        System.out.println("------------");
        System.out.println(linkedQueue);
        System.out.println("Size of queue: " + linkedQueue.size());
        System.out.println("Peek elem: " + linkedQueue.peek());
        System.out.println(linkedQueue);
        System.out.println("Poll elem: " + linkedQueue.poll());
        System.out.println(linkedQueue);
        System.out.println("------------");
        System.out.println();

        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        arrayQueue.add(1);
        arrayQueue.add(2);
        arrayQueue.add(3);
        arrayQueue.add(4);
        arrayQueue.add(5);
        arrayQueue.add(6);
        arrayQueue.add(7);
        System.out.println("Array Queue");
        System.out.println("------------");
        System.out.println(arrayQueue);
        System.out.println("Poll: " + arrayQueue.poll());
        System.out.println(arrayQueue);
        System.out.println("The first elem: " + arrayQueue.element());
        System.out.println(arrayQueue);
        System.out.println("------------");



    }
}
