package DataStructures.String;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "heart";
        String s2 = "earth";

        int[] res = new int[26];

        if(s1.length()!=s2.length()){
            System.out.println("Not anagram");
            return;
        }

        for(int i=0;i<s1.length();i++){
            res[s1.charAt(i)-'a']++;
            res[s2.charAt(i)-'a']--;
        }

        for(int i=0;i<res.length;i++){
            if(res[i]!=0){
                System.out.println("Not anagram");
                return;
            }
//            System.out.println((char) ('a'+i) +"->"+ res[i]);
        }
        System.out.println("Anagram");
    }
}
