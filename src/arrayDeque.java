import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dequeImplement = new ArrayDeque<>();
        // deque ka matlab hota hai hum aage se bhi element add kar skte hai aur piche se bhi
        //ye hum vha par use kar rahe hote hai jaise sliding window techniques m jha par aage aur piche dono se elemnt ko chk karna hota hai
        //2 function offerFirst() aage se add karta hai element
        // offerLast() piche se add karta hai element
        dequeImplement.offer(90);
        dequeImplement.offerFirst(56);   //56 phle aaega ab isme
        dequeImplement.offerLast(44);
        dequeImplement.offer(89); //offer hamesha last m hi add karta hai elements
        System.out.println("Printing deque of element: " + dequeImplement + "\n");

        //poll hamara karta hai jo elemnt sabse phle hai usko bahr nikal deta hai
        //peek jo hamaara element next nikalne vala hai vo btata hai
        //polllast - last se element remove karta hai

    }
}
