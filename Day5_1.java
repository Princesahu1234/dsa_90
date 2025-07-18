import java.util.Arrays;

public class Day5_1 {
    static int[] TwoSum(int[] arr){
        int tar=9;
        
        
        for(int i=0;i<arr.length;i++)
        {
            int temp=tar-arr[i];
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==temp)
                {
                  return new int [] {i,j};
                }
            }
        }
        return new int[]{};
    }



    public static void main(String[] args)
    {
        int[] arr={2,7,9,0,5};
        // int tar=9;
        
        
        // for(int i=0;i<arr.length;i++)
        // {
        //     int temp=tar-arr[i];
        //     for(int j=0;j<arr.length;j++)
        //     {
        //         if(arr[j]==temp)
        //         {
        //             System.out.println(i+"" +j);
        //             break;

        //         }
        //     }
        // }
        int[] data=TwoSum(arr);
        System.out.println(Arrays.toString(data));




    }
}

