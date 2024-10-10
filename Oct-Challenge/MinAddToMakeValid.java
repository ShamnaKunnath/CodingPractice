class Main {
	public int minAddToMakeValid(String s) {
		int oCount = 0, cCount = 0;
        for(char c : s.toCharArray()) {
            if(c == '('){
                oCount++;
            }
            else {
                if(oCount > 0){
                    oCount--;
                }
                else {
                    cCount++;
                }   
            }
        }
        return cCount + oCount;
    }

    public void main(String[] args) {
    	String s = "()))";
    	int out = minAddToMakeValid(s);
    	System.out.println(out);
    }
}