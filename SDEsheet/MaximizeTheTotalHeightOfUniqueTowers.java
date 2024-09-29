class Main {
	public long maximumTotalSum(int[] maximumHeight) {
		Arrays.sort(maximumHeight);
        long res = 0;
        int min = Integer.MAX_VALUE;
        for(int i = maximumHeight.length-1 ;i >=0; i--){
            min = Math.min(min, maximumHeight[i]);

            if(min < 1) return -1;
            res += min;
            min--;
        }
        return res;
	}
	public static void main(String[] args) {
		int[] maximumHeight = {2,3,4,3};
		System.out.println(maximumTotalSum(maximumHeight));
	}
}