import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionInJava {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(90);
        list.add(3);
        list.add(55);
        list.add(66);
        list.add(99);
        list.add(23);
        System.out.println("Min element is "+ Collections.min(list));    //min bta deta hai konsa hamara element minimuim hai
        System.out.println("Max element is "+ Collections.max(list));
        System.out.println("Frequency element is "+ Collections.frequency(list,90));

        Collections.sort(list);
        System.out.println("list is now sorted"+list);

        //ab chae descending m sort ho
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("List is in reverse order"+list);


    }
}
