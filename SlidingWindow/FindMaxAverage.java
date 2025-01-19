class FindMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0,right = k;
        int sum = 0;
        for(int i = left; i < k; i++){
            sum+=nums[i];
        }
        int maxValue = sum;
        while(right < nums.length){
            sum-=nums[left++];
            sum+=nums[right++];
            maxValue = Math.max(maxValue, sum);
        }
        return (double)maxValue/k;
    }
}