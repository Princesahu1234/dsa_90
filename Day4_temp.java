

public class Day4_temp {
    public static void main(String[] args) {
        int[] nums1={1,3};
        int[] nums2={2};
        int[] nums3={};
        int i;


    //   TreeSet<Integer> data=new TreeSet<>();
      for(i=0;i<nums1.length;i++)
      {
        nums3[i]=nums1[i];
      }  
      for(int j=0;j<nums2.length;j++)
      {
        i=i+1;
        nums3[i]=nums1[j];
      }  
      for(int j=0;j<nums3.length;j++)
      {
        System.out.println(nums3[j]);
      }

        }   
}
