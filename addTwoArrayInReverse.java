public class addTwoArrayInReverse {
    public static void main(String[] args) {
        int[] arr1={7,8,2};
        int[] arr2={3,6,8};
        int[] arr3=new int[(arr1.length+1)];
        int j=arr1.length;
        int sum;
        int carry=0;
        

        for(int i=0;i<=j;i++)
        {
            if(i!=j)
            {
            sum=arr1[i]+arr2[i]+carry;
            carry=sum/10;
            sum=sum%10;
            arr3[i]=sum;
            System.out.println(arr3[i]);
            }
            else{
                arr3[i]=carry;
                System.out.println(arr3[i]);

            }

            

        }
        
        
    }
    
}
