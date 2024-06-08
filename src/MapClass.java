import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        Map<String,Integer> mp= new HashMap<>();
        mp.put("tushar", 1);
        mp.put("verma",2);
        if(!mp.containsKey("tushar"))
        {
            mp.put("tushar", 93);    //  ye hum yha par chk kar rhe hai ki agar value nahi hai tabhi dali coz hashmap values ko override kar deta hai agar usko hum dubara likkhte hai toh

        }

        mp.putIfAbsent("verma", 99);  //putIfAbsent karege toh value overridde ho jagi agar chk karke karege toh value override nahi hogi
        System.out.println("printing values of hashmap: "+ mp);
    }
}
