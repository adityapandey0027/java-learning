import java.util.*;
class PriorityPQ{

    public static void main(String [] args){
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // pq.add(10);
        // pq.add(20);
        // pq.add(30);
        // pq.add(3);
        // System.out.println(pq.peek());
        // System.out.println(pq.remove());
        // System.out.println(pq.peek());

        Queue<Integer> q = new LinkedList<>();


        q.add(10);
        q.add(20);
        q.remove();

        System.out.println(q.peek());
    }
}