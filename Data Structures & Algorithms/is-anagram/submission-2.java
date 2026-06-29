class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length() ) return false;

        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String sortedWord = new String(charArray);

        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray2);
        String sortedWord2 = new String(charArray2);

       if(sortedWord.equals(sortedWord2)) return true;
       return false;

    }
}
