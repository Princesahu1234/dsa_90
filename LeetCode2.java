import java.util.LinkedList;
//import java.util.*;
// import java.math.*;

public class LeetCode2 {
    public static void main(String[] args) {
        LinkedList<Integer>l1=new LinkedList<>();
        LinkedList<Integer>l2=new LinkedList<>();
        LinkedList<Integer>l3=new LinkedList<>();

        l1.add(1);
        l1.add(4);
        l1.add(3);
        l2.add(5);
        l2.add(6);
        l2.add(4);

        int temp1=0;
        int temp2=0;
        int i=l1.size()-1;
        int j=l2.size()-1;

        for(;i>=0;i--)
        {
            double t=l1.get(i)*Math.pow(10, i);
            temp1 =(int)t+temp1;
        }

        for(;j>=0;j--)
        {
            double t=l2.get(j)*Math.pow(10,j);
            temp2=(int)t+temp2;
        }
        
        int temp3=temp1+temp2;
        int temp4=0;
        System.out.println(temp3);


        for(int k=0;k<=temp3;k++)
        {
            temp4=temp3%10;
            l3.add(temp4);
            temp3=temp3/10;
            if(temp3==0){
                break;
            }
        }
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

    }
}
