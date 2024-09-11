class NextPermutation {
	public void nextPermutation(int[] nums) {
	int i = 0,j=0,n=nums.length;
		for(i = n-2; i>=0;i--){
			if(nums[i]<nums[i+1])
				break;
		}
		//already sorted in decreasing order
		if(i == -1)
			reverse(nums, 0, n-1);
		else{
			for(j=n-1;j>=i;j--){
				if(nums[j]>nums[i])
					break;
			}
			swap(nums, i, j);
			reverse(nums, i+1,n-1);
		}
		
	}

	private void swap(int[] nums, int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	private void reverse(int[] nums,int s,int e){
		while(s<e){
			swap(nums, s, e);
			s++;
			e--;
		}
	}
}