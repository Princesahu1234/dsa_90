import java.util.ArrayList;
import java.util.HashSet;

public class Day4_6 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        set.add("hello");
        set.add("hello");
        set.add("hii");
        set.remove("hii");

        System.out.println(set.contains("hell"));

    }
    
}
