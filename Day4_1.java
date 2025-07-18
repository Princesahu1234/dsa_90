import java.util.ArrayList;

public class Day4_1 
{
    public static void main(String[] args) 
    {
        //int[] arr={1,2,3};
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(2,11);
        arr.set(1, arr.get(1)+1);
        int max=0;

        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)>max)
            {
                max=arr.get(i);
            }
            System.out.println(arr.get(i));
        }
        System.out.println("maximum value   "+max);


    }
    
}
