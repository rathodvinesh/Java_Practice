package Practice.Advance;

public class StringOperation {
    public static void main(String[] args) {
        String str = "I love india 123456";
        String[] strArray = str.split(" ");
        String max = "";
        String secondMax = "";
        String thirdMax = "";

       for(String word:strArray){
           if(max.length()<word.length()){
               thirdMax=secondMax;
               secondMax=max;
               max=word;
           }else if(word.length()>secondMax.length() && !word.equals(max)){
               secondMax=word;
           } else if (word.length()>thirdMax.length() &&  !word.equals(secondMax) && !word.equals(max)) {
               thirdMax=word;
           }
       }

        System.out.println("Max->"+max+" sMax->"+secondMax+" tMax->"+thirdMax);
    }
}
