class FourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
	int n = nums.length;
	Arrays.sort(nums);
	List<List<Integer>> ans = new ArrayList<>();
		for(int i = 0; i < n; i++){
			if(i>0 && nums[i] == nums[i-1]) continue;
			for(int j =  i+1; j < n; j++){
				if(j>i+1 && nums[j]==nums[j-1]) continue;
				int k = j+1, l = n-1;
				while(k < l){
					int sum = nums[i] + nums[j] + nums[k] + nums[l];
					if(sum < target) k++;
					else if (sum > target) l--;
					else {
						ans.add(Arrays.asList(nums[i] , nums[j] , nums[k] , nums[l]));
						int inK = k, inL = l;
						while(k < l && nums[k]==nums[inK])
							k++;
						while(k < l && nums[l]==nums[inL])
							l--;
					}
				}
			}
		}
		return ans;
	}
}