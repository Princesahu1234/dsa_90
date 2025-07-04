
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sixze of the array");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter number");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           
        }
        // int max=arr[0];
        
    //    for(int i =0;i<arr.length;i++){
    //     if (max<arr[i]) {
    //          max=arr[i];
    //     }
        //    System.out.println(max);
    // int min=arr[0];
    // for(int i =0;i<arr.length;i++){
    //     if (min>arr[i]) {
    //          min=arr[i];
    //     }
       
    //    }
    
    // System.out.println(min);
    int sum=0;
    for(int i =0;i<arr.length;i++){
        sum=arr[i]+sum;
    }
        
        System.out.println(sum);
    }
}
