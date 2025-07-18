// import javax.sound.sampled.SourceDataLine;

class Solution {
    public static int maxSubArray(int[] nums) {
        int max=0;
        int k=0;
        int l=8;
        int n=nums.length;

        for(int i=0;i<n-l;i++)
        {
            max=0;
            for(int j=i;j<i+l;j++)
            {
                max=nums[j]+max;
                 k=Math.max(k,max);
                
            }
        }
        return k;
        
    }
public static void main(String[] args)
{
    int[] nums={-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(nums));
    
}
}

