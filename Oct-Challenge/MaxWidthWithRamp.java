class Main {
	public int maxWidthRamp(int[] nums) {
		Stack<Integer> s = new Stack<>();

        for(int i = 0; i < nums.length; i++){
            if(s.isEmpty() || nums[s.peek()] > nums[i]) {
                s.push(i);
            }
        }

        int maxWidth = 0;
        
        for(int j = nums.length - 1; j >=0; j--){
            while(!s.isEmpty() && nums[s.peek()] <= nums[j]){
                maxWidth = Math.max(maxWidth, j - s.pop());
            }
        }

        return maxWidth;
	}

	public static void main(String[] args) {
		int [] nums = {6, 0, 8, 2, 1, 5};
		int maxWidth = maxWidthWithRamp(nums);
		System.out.println(maxWidth);
	}
}