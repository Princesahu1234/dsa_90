import java.util.ArrayList;

public class Day4_4 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        ArrayList<Integer> arr3=new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(6);
        arr.add(2,11);
        arr.set(1, arr.get(1)+1);
        int i=0;
        int j=0;
        for(int var: arr)
        {
            //System.out.println(var);
            if(var%2==0)
            {
               arr2.add(i,var);
               i=i+1;
            }
            else
            {
                arr3.add(j,var);
                j=j+1;
            }
        }
        
        System.out.println("even  "+arr2.get(i));
    }
    
}
