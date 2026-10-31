
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        HashMap<String, Integer> map1 = new HashMap<>();

        // Store the required frequency of each word
        for (String word : words) {
            map1.put(word, map1.getOrDefault(word, 0) + 1);
        }

        int len = words[0].length();
        int totalWords = words.length;

        // Try every possible starting offset
        for (int offset = 0; offset < len; offset++) {

            HashMap<String, Integer> map2 = new HashMap<>();

            int l = offset;
            int count = 0;

            for (int r = offset; r + len <= s.length(); r += len) {

                String word = s.substring(r, r + len);

                // If word is not required, reset the window
                if (!map1.containsKey(word)) {
                    map2.clear();
                    count = 0;
                    l = r + len;
                    continue;
                }

                // Add the current word to the window
                map2.put(word, map2.getOrDefault(word, 0) + 1);
                count++;

                // Remove extra occurrences from the left
                while (map2.get(word) > map1.get(word)) {

                    String leftWord = s.substring(l, l + len);

                    map2.put(leftWord, map2.get(leftWord) - 1);

                    if (map2.get(leftWord) == 0) {
                        map2.remove(leftWord);
                    }

                    l += len;
                    count--;
                }

                // All required words are present
                if (count == totalWords) {

                    result.add(l);

                    // Move left to find overlapping windows
                    String leftWord = s.substring(l, l + len);

                    map2.put(leftWord, map2.get(leftWord) - 1);

                    if (map2.get(leftWord) == 0) {
                        map2.remove(leftWord);
                    }

                    l += len;
                    count--;
                }
            }
        }

        return result;
    }
}
