public class Day2_3 {
    public static void main(String[] args)
    {
       int[] arr1={1,2,3,5};
       int[] arr2={5,2,3,4};
       int max=0;
       int max2=0;
       for(int i=0;i<arr1.length;i++){
        if(max<arr1[i]){
            max=arr1[i];
        }
       }
       System.out.println(max);
       for(int j=0;j<arr2.length;j++){
        if(max<arr2[j]){
            max2=arr2[j];
        }
       }
       System.out.println(max2);
    }
}
