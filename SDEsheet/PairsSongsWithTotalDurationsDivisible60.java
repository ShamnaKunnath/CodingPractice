class PairsSongsWithTotalDurationsDivisible60 {
	public int numPairsDivisibleBy60(int[] time) {
		int c[] = new int[60], res = 0;
		for(int t : time){
			int x = t%60;
			if(x > 0) res += c[60-x];
			else res += c[0];
			c[x]++;
		}
		return res;
	}
}