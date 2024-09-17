class GameOfLife {
	public void gameOfLife(int[][] board) {
		int m = board.length, n = board[0].length; 
        int[][] res = new int[m][n];
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n ;j++){
				int liveCount = 0,curI = i,curJ = j+1;
				if(curI>=0 && curJ >=0 && curI < m && curJ < n){
					if(board[curI][curJ] == 1) liveCount++;
				}
				
				curI = i;curJ = j-1;
				if(curI>=0 && curJ >=0 && curI < m && curJ < n){
					if(board[curI][curJ] == 1) liveCount++;
				}

				curI = i+1;curJ = j;
				if(curI>=0 && curJ >=0 && curI < m && curJ < n){
					if(board[curI][curJ] == 1) liveCount++;
				}

				curI = i-1;curJ = j;
				if(curI>=0 && curJ >=0 && curI < m && curJ < n){
					if(board[curI][curJ] == 1) liveCount++;
				}

				curI = i+1;curJ = j-1;
				if(curI>=0 && curJ >=0 && curI < m && curJ < n){
					if(board[curI][curJ] == 1) liveCount++;
				}

				curI = i+1;curJ = j+1;
				if(curI>=0 && curJ >=0 && curI < m && curJ < n){
					if(board[curI][curJ] == 1) liveCount++;
				}

				curI = i-1;curJ = j-1;
				if(curI>=0 && curJ >=0 && curI < m && curJ < n){
					if(board[curI][curJ] == 1) liveCount++;
				}

				curI = i-1;curJ = j+1;
				if(curI>=0 && curJ >=0 && curI < m && curJ < n){
					if(board[curI][curJ] == 1) liveCount++;
				}
                System.out.println(liveCount);
				if(board[i][j] == 0){
					if(liveCount == 3) res[i][j] = 1;
				}
				else{
					if(liveCount < 2) res[i][j] = 0;
					else if(liveCount > 3) res[i][j] = 0;
                    else res[i][j] = board[i][j];
				}
			}
		}

        for(int i = 0; i < m; i++){
			for(int j = 0; j < n ;j++){
                board[i][j] = res[i][j];
            }
        }
	}
}