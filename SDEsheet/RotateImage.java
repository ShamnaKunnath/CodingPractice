class RotateImage {
	public void rotateImage (int[][] matrix){
		int n = matrix.length;

		//Transpose of the metrix
		for(int i = 0;i < n; i++){
			for(int j = i+1; j < n;j++){

				//swap the elements
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		//reverse each row

		for(int i = 0; i < n;i++){
			int s = 0 , e = n-1;
			while(s < e){
				int temp = matrix[i][s];
				matrix[i][s] = matrix[i][e];
				matrix[i][e] = temp;
			}
		}
	}
}