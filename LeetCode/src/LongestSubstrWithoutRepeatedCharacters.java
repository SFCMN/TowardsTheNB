import java.util.HashMap;

public class LongestSubstrWithoutRepeatedCharacters {
  public int lengthOfLongestSubstring(String s) {
    final int strLength = s.length();
    int headIndexOfResult = 0;
    int maxLength = 0;
    final HashMap<Character, Integer> charIndexMap = new HashMap<>();

    for (int index = 0; index < strLength; index++) {
      final char currentChar = s.charAt(index);
      if (charIndexMap.containsKey(currentChar)) {
        headIndexOfResult = Math.max(headIndexOfResult, charIndexMap.get(currentChar) + 1);
      }
      maxLength = Math.max(maxLength, index - headIndexOfResult + 1);
      charIndexMap.put(currentChar, index);
    }

    return maxLength;
  }

  public static void main(String[] args) {
    final LongestSubstrWithoutRepeatedCharacters longestSubstrWithoutRepeatedCharacters = new LongestSubstrWithoutRepeatedCharacters();
    System.out.println(longestSubstrWithoutRepeatedCharacters.lengthOfLongestSubstring("abcabcbb")); // 3
    System.out.println(longestSubstrWithoutRepeatedCharacters.lengthOfLongestSubstring("bbbbb")); // 1
    System.out.println(longestSubstrWithoutRepeatedCharacters.lengthOfLongestSubstring("pwwkew")); // 3
    System.out.println(longestSubstrWithoutRepeatedCharacters.lengthOfLongestSubstring("au")); // 2
    System.out.println(longestSubstrWithoutRepeatedCharacters.lengthOfLongestSubstring("a")); // 1
    System.out.println(longestSubstrWithoutRepeatedCharacters.lengthOfLongestSubstring("")); // 0
    System.out.println(longestSubstrWithoutRepeatedCharacters.lengthOfLongestSubstring("nfpdmpi")); // 5
    System.out.println(longestSubstrWithoutRepeatedCharacters.lengthOfLongestSubstring("tmmzuxt")); // 5
    System.out.println(longestSubstrWithoutRepeatedCharacters.lengthOfLongestSubstring("abba")); // 2
  }
}
