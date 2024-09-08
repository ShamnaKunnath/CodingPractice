class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {

		int n = nums.length;
		int[] pre = new int[n];
        //int[] suf = new int[n];
		if(n < 2) return pre;
		
		Arrays.fill(pre, 1);
        //Arrays.fill(suf, 1);

		for(int i = 0; i < n-1; i++){
			pre[i+1]=pre[i]*nums[i];
		}
		int suf = 1;
		for(int i = n-1; i>0; i--){
			suf*=nums[i];
			pre[i-1]*=suf;
			//suf[i-1]=suf[i]*nums[i];
		}

        //for(int i = 0; i<n; i++)
        //    pre[i]*=suf[i];
		return pre;
    }
}