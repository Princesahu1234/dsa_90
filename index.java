public class index {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int max=arr[0];
       for(int i =1;i<arr.length;i++){
        max=arr[i]+max;
       }
       System.out.println(max);
    }
}
