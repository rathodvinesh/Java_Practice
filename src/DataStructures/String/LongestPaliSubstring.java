package DataStructures.String;

public class LongestPaliSubstring {
    public static void main(String[] args) {
        String s = "babad";
        String res="";
        int resLen=0;

        for(int i=0;i<s.length();i++){
            //Odd
            int l=i,r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if((r-l+1)>resLen){
                    res=s.substring(l,r+1);
                    resLen=r-i+1;
                }
                l--;
                r++;
            }
            //even
            l=i;
            r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if((r-l+1)>resLen){
                    res=s.substring(l,r+1);
                    resLen=r-i+1;
                }
                l--;
                r++;
            }
        }
        System.out.println(res);
    }
}
