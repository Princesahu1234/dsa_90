import java.util.HashMap;

public class Day4_8 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("ane", 1);
        map.put("two", 3);
        map.put("Three", 2);
         map.put("Three", 3);
        // System.out.println(map.containsKey("tw"));
        // System.out.println(map.toString);
        System.out.println(map.get("two"));
    }
    
}
