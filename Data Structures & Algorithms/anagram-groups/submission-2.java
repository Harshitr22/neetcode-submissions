class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> anagrams = new ArrayList<>();
        for(String word : strs){
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            if(map.containsKey(sortedWord)){
                map.get(sortedWord).add(word);
            }else{
                map.put(sortedWord, new ArrayList<>(List.of(word)));
            }
        }

        for(Map.Entry<String, List<String>> listing : map.entrySet()){
            anagrams.add(listing.getValue());
        }
        return anagrams;
    }
}
