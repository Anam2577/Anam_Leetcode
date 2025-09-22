class Solution {
    public int[] twoSum(int[] nums, int target) {

        int i = 0;
        int n = nums.length;
        int sum = 0;
        int j = 0;

        int result[] = new int[2];

        for(j=0 ; j<n ; j++)
        {
            for(i=0 ; i<j ; i++)
            {
                sum = nums[j] + nums[i];
                
                if(sum == target)
                {
                    for(int k =0 ; k<2 ; k++)
                    {
                        result[k] = j;
                        k++;
                        result[k] = i;
                    }
                }
            }
        }
        
        return result;
        
    }
}