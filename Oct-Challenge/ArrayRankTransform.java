class Main {
	public int[] arrayRankTransform(int[] arr) {
		int[] temp =  new int[arr.length];
        int t = 0;
        for(int e:arr)
            temp[t++] = e;
        Arrays.sort(temp);
        Map<Integer, Integer> m = new HashMap<>();
        int r = 1;
        for(int i = 0;i <temp.length; i++){
            if(i > 0 && temp[i] != temp[i-1])
                r++;
            m.put(temp[i],r);
        }
        for(int i = 0;i <arr.length; i++){
            arr[i] = m.get(arr[i]);
        }
        return arr;
    }

	public static void main(String args[]) {
		int[] input = {37,12,28,9,100,56,80,5,12};
		int[] result = arrayRankTransform(input);
		for(int e : result){
			System.out.print(e);
			System.out.print(" ");
		}
		System.out.println();
	}
}