import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        //queue using linked list
        Queue<String> q = new LinkedList<>();
        q.offer("tushar"); //offer se hum element ko add kar rahe hote hai
        //add bhi hota hai but aagar successfully add nhi hua toh vo exception throw kar deta hai vo matlab app crash ho jata hai
        q.offer("verma");
        System.out.println("Printing queue- "+ q);
        System.out.println(q.poll()); //poll se hum element ko remove bhi karte hai and saath m ye print bhi karta hai
        //peek method btata hai ab konsa element tyaar hai bahr nikalne k lie
        System.out.println("peek bta rha hai konsa next hai bahr nikalne k lie - " + q.peek());
    }
}
