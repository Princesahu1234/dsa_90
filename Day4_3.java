import java.util.ArrayList;

public class Day4_3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(6);
        arr.add(2,11);
        arr.set(1, arr.get(1)+1);
        for(int var: arr)
        {
            //System.out.println(var);
            if(var%2==0)
            {
                System.out.println("even  "+var);
            }
            else{
                System.out.println("odd   "+var);
            }
        }
    }
    
}
