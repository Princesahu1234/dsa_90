import java.util.ArrayList;

public class Day4_5 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(6);
        arr.add(2,11);
        arr.set(1, arr.get(1)+1);
        arr.remove(1);
        System.out.println(arr.contains(5));
        for(int var: arr)
        {
            System.out.println(var);
            
        }
    }
    
}
