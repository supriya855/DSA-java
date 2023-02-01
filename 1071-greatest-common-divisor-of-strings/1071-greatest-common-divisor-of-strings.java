class Solution {
    public String gcdOfStrings(String str1, String str2) {
       int len1=str1.length();
        int len2=str2.length();
        if(!(str1+str2).equals(str2+str1))
            return "";
        else
        return str1.substring(0,gcd(len1,len2));
}

    public int gcd(int x,int y){
        int gcd=1;
        for(int i=1;i<=x&&i<=y;i++){
            if(x%i==0&&y%i==0)
                gcd=i;
        }
        return gcd;
        
    }   
    
}