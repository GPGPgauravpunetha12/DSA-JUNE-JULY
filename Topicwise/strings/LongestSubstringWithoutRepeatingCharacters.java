public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        // s = "abcabcbb" using sliding window whith the help of hash and maintain count as well
        int i=0;
        int j=0;
        int max=0;
        int hashset[]=new int[128];
        while(j<s.length()){
            char  singlechar=s.charAt(j);
            hashset[singlechar]++;// a=97
            
            while(hashset[singlechar]>1){
                
           char leftchar=s.charAt(i)   ;
                
                hashset[leftchar]--;
                i++;//slide window
                
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
    
        System.out.println(lengthOfLongestSubstring(str));
    }
}

// when duplicat come then inc i otherwis J