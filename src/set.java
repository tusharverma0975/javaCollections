import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {
        Set<Integer> setImpl= new HashSet<>();
        setImpl.add(88);
        setImpl.add(99);
        setImpl.add(929);
        System.out.println("setImpl: " + setImpl);  //set m ab jo bhi values aaegi vo unordered way m store hogi
        setImpl.remove(88);
   setImpl.clear();  // ye complete array ko empty kar deta hai jaise agar humne ek for loop chalaya aur test cases likh rakhe hai ki ab ye test cases ho gyue ab hamara array empty ho jae toh iske lie clear use karlete hai

        Set<Integer> setImpl2= new LinkedHashSet<>();  //ab isme sab kuch same rahega bus jo order hai vo vo ek k baad ek ho jaega element ek k baad ek dalege same order m
        Set<Integer> setImpl3= new TreeSet<>(); //tree set m bas ye hai hamare element saare sorted order m hote hai baaki sab same

    }


}
