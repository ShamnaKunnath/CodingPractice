class Main {
	public int minElement(int[] nums) {
		int min = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length; i++){
            min = Math.min(min, digSum(nums[i]));
        }
        return min;
	}

	private int digSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n%10;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
    	int[] nums = {10,12,13,14};
    	System.out.println(minElement(nums));
    }
}