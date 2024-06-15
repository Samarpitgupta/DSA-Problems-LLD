class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashMap to store the last seen index of each character
        HashMap<Character, Integer> map = new HashMap<>();
        // Initialize the maximum length of substring
        int maxLength = 0;
        // Initialize the left pointer of the sliding window
        int left = 0;

        // Iterate over each character in the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            // If the current character is already in the map and its index is within the current window
            if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
                // Move the left pointer to 1 position after the last occurrence of the current character
                left = map.get(currentChar) + 1;
            }
            // Update the map with the current character's index
            map.put(currentChar, right);
            // Calculate the length of the current window and update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}