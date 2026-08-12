class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndex = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            if (charIndex.containsKey(currentChar)) {
                left = Math.max(left, charIndex.get(currentChar) + 1);
            }
            charIndex.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
