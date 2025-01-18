class LengthOfLongestSubstring {

    // array ds -> time O(n) -> space -> O(c) 128 constant array size
    public int lengthOfLongestSubstring4(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charArray = new int[128];
        Arrays.fill(charArray, -1);
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            Character c = s.charAt(right);
            if (charArray[c]>=left) {
                left = charArray[c] + 1;  
            }
            charArray[c] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    // Uses unordered map ds -> containsKey operation can take additional time
    public int lengthOfLongestSubstring3(String s) {
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            Character c = s.charAt(right);
            if (!charMap.containsKey(c) || charMap.get(c) < left) {
                charMap.put(c,right);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                left = charMap.get(c) + 1;
                charMap.put(c, right);
            }
        }
        return maxLength;
    }

    // Uses set ds -> time complexity is better but remove elements from set can takes time
    public int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        
        return maxLength;
    }

    //Initial approach -> bad memory usage and time complexity
    public int lengthOfLongestSubstring1(String s) {
        Set<Character> set = new HashSet<Character>();
        int ans = 0;
        int maxLength = 0;
        Map<Character, Integer> pos = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                ans++;
                pos.put(c, i);
            }
            else{
                if(ans > maxLength){
                    maxLength = ans;
                }
                set.clear();
                ans = 0;
                int j = pos.get(c);
                pos.put(c, i);
                System.out.println(j);
                for(int k = j + 1; k <= i; k++){
                    set.add(s.charAt(k));
                    ans++;
                }   
            }
        }
        if(ans > maxLength)
            return ans;
        else
            return maxLength;
    }
}
