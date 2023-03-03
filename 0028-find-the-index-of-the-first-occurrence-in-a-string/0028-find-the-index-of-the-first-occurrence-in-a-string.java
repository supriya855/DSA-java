class Solution {
    public int strStr(String haystack, String needle) {
         int len1 = haystack.length();
         int len2 = needle .length();
         int j=len2-1,i=0;
        for(i=0,j=len2-1;j<len1;i++,j++){
            if(needle.equals(haystack.substring(i,j+1))){
                return i;
            }
        }
               return -1;
        
    }
}