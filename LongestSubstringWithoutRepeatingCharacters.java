import java.util.HashMap;
class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {

        // for loop, use int max to record max length
        // add element in hashmap, 
        // use left pointer to get max length = i - left +1;
        int max =0;
        int left = 0;
        HashMap<Character,Integer> map = new HashMap();
        int len = s.length();
        for(int i = 0;i<len;i++){
            // left
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        int ans = l.lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
}