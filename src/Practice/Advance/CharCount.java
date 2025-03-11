package Practice.Advance;

public class CharCount {
    public static void main(String[] args) {
        int[] hash = new int[256];
        String s= "aabbcdddededfg";

        for(int i=0;i< s.length();i++){
            hash[s.charAt(i)]++;
        }

        for (int i=0;i<256;i++){
            if(hash[i]>0){
                System.out.print((char) i+":"+hash[i]);
            }
//            System.out.println((char) i+":"+hash[i]);
        }
    }
}
