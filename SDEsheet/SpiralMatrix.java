class SpiralMatrix {
	pulic List<Integer> spiralOrder(int[][] matrix) {
		int[][] dir = {{0,1}, {1,0}, {0,-1}, {-1,0}};

		int n = matrix.length,m = matrix[0].length;

		List<Integer> ans = new ArrayList<>();

		int i = 0, j = 0, d = 0;

		while(ans.size() < n*m){
			ans.add(matrix[i][j]);

			matrix[i][j] = 1000;

			int newI = i + dir[d][0];
			int newJ = j + dir[d][1];

			if(newI >= n || newJ >= m || newI < 0 || newJ < 0 || matrix[newI][newJ] == 1000){
				d = (d+1)%4;
				newI = i + dir[d][0];
				newJ = j + dir[d][1];
			}

			i = newI; j = newJ;

		}
		return ans;

	}
}