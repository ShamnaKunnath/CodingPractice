class DivisorSubstrings {
    public int divisorSubstrings(int num, int k) {
        int n = num;
        int factor = 1, i = 0, rem;
        int ans = 0;
        while (i < k) {
            factor *= 10;
            i++;
        }
        while (n / factor > 0) {
            rem = n % factor;
            if (rem > 0 && num % rem == 0){
                ans++;
            }
            n = n / 10;
        }
        rem = n % factor;
        if (rem > 0 && num % rem == 0){
            ans++;
        }
        return ans;
    }
}