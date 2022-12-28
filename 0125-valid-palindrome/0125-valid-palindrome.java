class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            int remStart=s.charAt(start);
            int remEnd=s.charAt(end);
            if(!Character.isLetterOrDigit(remStart)){
                start++;
    
            }
            else if(!Character.isLetterOrDigit(remEnd)){
                end--;
            }
            else{
                if(Character.toLowerCase(remStart)!=Character.toLowerCase(remEnd)){
                    return false;
                }
                start++;
                end--;
            }
            
        }
        return true;
     }
        
}