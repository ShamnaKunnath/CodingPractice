class ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
		public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
		int sf = nums[0] + nums[1] + nums[2];
		if(n == 3) return sf;
		int sl = nums[n-1] + nums[n-2] + nums[n-3];
		if(sf >= target) return sf;
		else if(target >= sl) return sl;
		else {
			int temp = Integer.MAX_VALUE, closeSum = sf;
			for(int i = 0; i < n; i++){
				if(i > 0 && nums[i] == nums[i-1]) continue;
				int j = i + 1, k = n - 1, sum = 0;
				while(j < k){
					sum = nums[i] + nums[j] + nums[k];
                    int diff = Math.abs(target - sum);
                    if (diff < temp){
					    temp = diff;
					    closeSum = sum;
				    }
					if(sum < target) j++;
					else if (sum > target) k--;
					else {
						return sum;
					}
				}
				
			}
			return closeSum;
		}
    }
}