import java.sql.SQLOutput;
import java.util.Stack;

public class StackLearn {
    public static void main(String[] args) {


        Stack<Integer> tushar = new Stack<>();
        tushar.push(9);
        tushar.push(8);
        for(Integer values: tushar)
        {
            System.out.println("Values are "+ values);
            System.out.println(tushar.peek());
//            System.out.println(tushar.pop());
        }
    }
}
