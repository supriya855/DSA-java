class Solution {
    public void reverseString(char[] s) {
        int idx=0;
        char[] ch= new char[s.length];
        for(int i=0;i<ch.length;i++){
            ch[i]=s[i];
        }
       
      for(int i=ch.length-1;i>=0;i--){
          s[idx++]=ch[i];
          
      }
        System.out.println(s);
    }
}