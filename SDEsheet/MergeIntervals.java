class MergeIntervals {
	public int[][] merge(int[][] intervals){
		//base condition
		if(intervals.size() <= 1) return intervals;

		//sort intervals based on starting point
		Arrays.sort(intervals, new Comparator<int[]>(){
			public int compare(int[] a, int[] b){
				return a[0] - b[0];
			}
		});

		List<int[]> ans = new ArrayList<>();

		ans.add(intervals[0]);
		int [] fIn = ans.get(0);
		int i = 1 ;
		

		int n = intervals.length;
		while(i < n){
			int [] sIn = intervals[i];
			if(sIn[0] < fIn[1]){
				int [] inter = new int[2];
				inter[0] = fIn[0];
				if(fIn[1] > sIn[1]) inter[1]= fIn[1];
				else inter[1] = sIn[1];
				ans.remove(ans.size()-1);
				ans.add(inter);
				fIn = inter;
			}
			else{
				ans.add(sIn);
				fIn = sIn;
			}
			i++;

		}
		int[][] res = new int[ans.size()][2];
		i = 0;
		for(int[] e : ans)
			res[i++] = e;
		return res;
	}
}


