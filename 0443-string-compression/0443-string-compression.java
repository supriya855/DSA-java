class Solution {
    // Read question carefully
    // use hashmap
    public int compress(char[] chars) {
        char ch=chars[0];
        int count=1;
        if(chars.length==1) return chars.length;
       StringBuilder res= new StringBuilder();
        for(int i=1;i<chars.length;i++){
            if(ch==chars[i]) count++;
            else{
                if(count==1) res.append(ch);
                    else
                      res.append(ch).append(count);
                ch=chars[i];
                count=1;
                
            }
        }
            if(count==1) res.append(ch);
            else
                res.append(ch).append(count);
      String str=  res.toString();
      char[] c= str.toCharArray();
        for(int i=0;i<c.length;i++){
             chars[i]=c[i];
        }
        return c.length;
    }
}