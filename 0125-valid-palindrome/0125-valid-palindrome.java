class Solution {
    public boolean isPalindrome(String s) {
        int l=0, r=s.length()-1; // l is left pointer and r is righter pointer 
        s=s.toLowerCase(); // all string convert to lower case 
        while(l<r){
            char ch1=s.charAt(l);// take position character in left pointer
            char ch2=s.charAt(r);// take position character in right pointer ;
            if(!(ch1>='a'&& ch1<='z' || ch1>='0' && ch1<='9'))// condition if not check left pointer ke liey 
            {
                l++;
                continue;
            }
            if(!(ch2>='a'&& ch2<='z' || ch2>='0' && ch2<='9'))// condition if not check right pointer ke liey 
            {
                r--;
                continue;
            }
            if(ch1!=ch2) // check charectr check euality 
            return false;
            l++;
            r--;
        }
       return true; // return result
       
    }
}