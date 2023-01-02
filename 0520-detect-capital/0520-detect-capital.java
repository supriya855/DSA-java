class Solution {
    public boolean detectCapitalUse(String word) {
         int count=0;
        char[] ch=word.toCharArray();
        
        System.out.println(Arrays.toString(ch));
        
        for(int i=0;i<ch.length;i++){
            
            if(Character.isUpperCase(ch[i])){
                count++;
            }
            
        }
       if(count==1){
           if(Character.isUpperCase(ch[0])){
               count=1;
           }
           else{
               count=-1;
           }
       }
        return count==ch.length||count==0||count==1;
        
    }
}