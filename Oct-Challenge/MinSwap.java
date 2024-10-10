class Main {
	public int minSwap(String s) {
		int count = 0;
        for(char c : s.toCharArray()){
            if(c == '['){
                count++;
            }
            else if(count > 0){
                count--;
            }
        }
        return (count+1)/2;
	}

	public void main(Strin[] args) {
		String s = "]]][[[";
		int minSwap = minSwap(s);
		System.out.println(minSwap);
	}
}