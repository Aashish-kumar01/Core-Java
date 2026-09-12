import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Part of the Queue interface 
        // orders elements based on their natural ordering (for primitive lowest first)
        // custom comparator for customized ordering
        // does not allow null elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(12);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        System.out.println(pq.peek());


        // Internal working
        // PriorityQueue is implemented as a min-heap by default (for natural ordering)
        
    }
}
