class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashSet<Character> set = new HashSet<>();
      int i=0,j=0,max=0;//slower pointer,fast pointer, result val
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max=Math.max(max,set.size());
            }
            else{
                set.remove(s.charAt(i++));// we are removing all characters i.e we have unique when there is a repetitive characters
            }
                
        }
        return max;
    }
}
//Intially you can think that we find unique using hashset
// if you take ex: "pwwkew"  we are removing the elements if see any repetitive elements then finding max size of set