class SubarraySum {
	public int subarraySum(int[] nums, int k) {
		int sum = k,count = 0;
		for(int i = 0; i < nums.length; i++){
			int j = i;
			while(j < nums.length){
                k-=nums[j++];
                if(k==0) count++;
            }
			k = sum;
		}
		return count;
	}
}