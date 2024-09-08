class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		
		if(nums.length < 3) return ans;
		
		Arrays.sort(nums);
		int n = nums.length;
		if(nums[0] > 0 || nums[n - 1] < 0) return ans;

		for(int i = 0;i < n; i++){
			if(nums[i] > 0) break;

			if(i > 0 && nums[i] == nums[i - 1]) continue;

			int j = i + 1, k = n - 1;
			while(j < k){
				int sum = nums[i] + nums[j] +nums[k];
				if(sum < 0) j++;
				else if(sum > 0) k--;
				else{
					ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
					int inJ = j,inK = k;
					while(j < k && nums[j] == nums[inJ]) j++;

					while(j < k && nums[k] == nums[inK]) k--;
				}
			}
			
		}
		return ans;

	}
}