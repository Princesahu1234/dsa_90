public class Day2_2 
{
    public static void main(String[] args)
    {
        int[] arr1={1,3,4,5};
        int[] arr2={4,6,5,6};
        int[] arr3=new int[(arr1.length+arr2.length)];
        int max;
        int f=0;

        
        for(int i=0;i<arr1.length;i++)
        {
            arr3[i]=arr1[i];

        }
        for(int j=0;j<arr2.length;j++)
        {
            arr3[j+arr1.length]=arr2[j];
        }



        for(int k=0;k<arr1.length;k++)
        {
            for(int n=0;n<arr2.length;n++)
            {
                if(arr1[k]==arr2[n])
                {
                  f=1; 
                    break;
                   
                }

            }
            if(f==0){
           System.out.println(arr3[k]);
           f=0; 
            }
        }
    }
}
