import java.util.*;

public class Day4_9 
{
    public static void main(String[] args) 
    {
        HashMap<Character,Integer> map=new HashMap<>();
        String s="priiinn";
        int temp=1;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.get(ch)==temp){
               temp=temp+1;
             }
            // if(null=="g"){
            //     System.out.println("hehwh");
            // }
            else{
             map.put(ch,temp);
               // System.out.println("hii");
            }
            

            // map.put(ch,temp);


        }
        System.out.println(map);

    }
    
}
