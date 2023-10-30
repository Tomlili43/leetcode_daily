class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        // return int maxStart int maxLen;
        //if len ==1 or null return s;
        // dp[l-1][r-1] =  ( s[l]==s[r] && ( dp[l][r] || l-r<=2// for short str)
        // when l == r, dp[l][r]=1;
        if(s==null || s.length()<2){
            return s;
        }
        int len = s.length();
        int maxStart=0;
        int maxLen =1;
        boolean[][] dp= new boolean[len][len];
       
        // for loop anchor r as suffix string
        // for loop l as prefix
        for(int r =1;r<len;r++){
            for(int l=0;l<r;l++){
                if(s.charAt(l)==s.charAt(r)&&(r-l<=2||dp[l+1][r-1])){
                    dp[l][r] = true;
                    if((r-l+1)>maxLen){
                        maxLen = r-l+1;
                        maxStart = l;
                    }
                }
            }
        }
        
        return s.substring(maxStart,maxStart+maxLen);
    }
    public static void main(String[] args) {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        String s = "aacabdkacaa";
        System.out.println(lps.longestPalindrome(s));
    }
}