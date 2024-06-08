import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrryList {
    public static void main(String[] args) {
        ArrayList<String> tushar = new ArrayList<>();  // jaisi humne ye likha isse ek empty array ban jata hai
        tushar.add("verma");
        //add function hamesha last m number add kar rha hota hai   //matlab last m ab 3 add ho jaega
        tushar.add(String.valueOf('3'));
        System.out.println(tushar);


        List<String> listMaker= new ArrayList<>() ;
            listMaker.add("tushar");

           tushar.addAll(listMaker);
//        listMaker.clear();  isse complete list empty

        tushar.set(2,"ghjk");

        //contais method se pta chalta hai vo value present hai ya nhi usme
        System.out.println("value contains- "+listMaker.contains("bism"));
        System.out.println("printing the added values- "+tushar);

        for(int i=0;i<tushar.size();i++)
        {
            System.out.println("values are- "+ tushar.get(i));
        }
        for(String values : tushar)
        {
            System.out.println("for each element is" + values);
        }


        //printing up the list
        

     }

}
