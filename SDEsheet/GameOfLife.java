class GameOfLife {
	public void gameOfLife(int[][] board) {
		int m = board.length, n = board[0].length; 
        for(int i = 0; i < m; i++){
			for(int j = 0; j < n ;j++){
				int liveCount = 0,curI = i,curJ = j;
				
				int[][] dir = {{0,1}, {0,-1}, {1,0}, {-1,0}, {1,-1}, {1,1}, {-1,-1}, {-1,1}};
				int d = 0;
				
				while(d < 8){
					curI = i + dir[d][0];
					curJ = j + dir[d][1];
					if(curI>=0 && curJ >=0 && curI < m && curJ < n){
						if(board[curI][curJ] == 1 || board[curI][curJ] == 2) liveCount++;
					}
					d++;
				}
				// 0 -> 1 3
				// 1 -> 0 2
				if(board[i][j] == 0 || board[i][j] == 2){
					if(liveCount == 3) board[i][j] = 3;
				}
				else{
					if(liveCount < 2) board[i][j] = 2;
					else if(liveCount > 3) board[i][j] = 2;
				}
				if(i-1 >= 0 && j-1 >=0 && i-1 < m && j-1 < n){
					int t = board[i-1][j-1];
					if(t > 1) board[i-1][j-1]-=2;
				}
                if(i == m-1 && j-1 >= 0){
                    int t = board[i][j-1];
					if(t > 1) board[i][j-1]-=2;
                }
                if(j == n-1 && i-1 >= 0){
                    int t = board[i-1][j];
					if(t > 1) board[i-1][j]-=2;
                }
                if(i == m-1 && j == n-1){
                    int t = board[i][j];
					if(t > 1) board[i][j]-=2;
                }
			}
		}
    }
}