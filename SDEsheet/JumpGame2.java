class Main {
	public int jump(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        ans.add(nums.length);
		helper(0, ans, 0,nums);
        return ans.get(ans.size()-1);
    }
    private void helper(int ind, List<Integer> ans, int j,int[] nums) {
		if(ind == nums.length-1){
			if(j < ans.get(ans.size()-1)){
                ans.add(j);
            }
            return ;
		}
        if(ind < nums.length-1){
            for(int i = 1; i <= nums[ind]; i++){
			    j++;
			    helper(ind+i, ans, j, nums);
			    j--;
		    }
        }
	}
}

//Time limit exceeded . Recursive solution.