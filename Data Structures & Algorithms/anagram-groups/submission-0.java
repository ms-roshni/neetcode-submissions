class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm = new HashMap<>();

        for(String word: strs){
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            String sortedWord = new String(wordArr);

            if(!hm.containsKey(sortedWord)){
                hm.put(sortedWord, new ArrayList<>());
            }
            hm.get(sortedWord).add(word);
        }
        return new ArrayList(hm.values());
    }
}
