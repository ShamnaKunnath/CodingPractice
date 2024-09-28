class Main {
	public int maxScore(int[] cardPoints, int k) {
		int left = 0, right = cardPoints.length-1;
		int maxScore = 0;
		while(k > 0) {
			maxScore += Math.max(cardPoints[left], cardPoints[right]);
			k--;
		}
		return maxScore;
	}
}