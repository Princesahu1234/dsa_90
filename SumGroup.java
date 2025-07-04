public class SumGroup {
    public static void main(String args[]){
    int[] arr={1,4,5,2};
    int targ = 7;
    int temp=0 ;
    for(int i=0;i<arr.length;i++){
        for(int k=0;k<arr.length;k++)
        {
            temp=arr[i]+arr[k];
            if (temp==targ) {

                
            System.out.println(arr[i]);    
        System.out.println( arr[k]);        }
        }

    }
}
}
