import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.offer(3);
        pq.offer(4);
        pq.offer(5);
        System.out.println("Priority queue is: "+pq);

        //hum queue se bhi implement kar skte hai bus prioirty queue yahi hota hai ki vo priority wise elements ko arrange karta hai
        //min heap and max heap wise
        System.out.println("Now printing it using quueu");
        Queue<Integer> queue= new PriorityQueue<>();
        queue.offer(14);
        queue.offer(5);   // ab isme min heap implement ho rha hai aur yha par sabse chota element sbse phle print hoga aur poll() ye bhi sbse phla elemenrt priority wise chota vala hi aaega
        queue.offer(600);
        System.out.println("Printing queue using queue: "+queue);

        //ab jaise max heap m convert karna hai toh comparator ki help se bana skte hai
        Queue<Integer>  maxHeapImplement= new PriorityQueue<>(Comparator.reverseOrder());  // bas ye line likhni hai
        maxHeapImplement.offer(90);
        maxHeapImplement.offer(800);
        System.out.println("maxHeap using queue: "+maxHeapImplement);

    }
}
