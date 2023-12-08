public class MergeStringsAlternately {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
    }

    public static String mergeAlternately(String word1, String word2) {
        String altarnate = "";
        int chainSize = word1.length()+word2.length();
        Character ch=null;
        int helper1=0;
        int helper2=0;

        for(int i=0; i<chainSize; i++){
            if(helper1<word1.length()||helper2<word2.length())chainSize++;
            if(i%2==0 && helper1<word1.length()) {
                ch = word1.charAt(helper1);
                helper1++;
                altarnate = altarnate + ch;
            }else if (helper2<word2.length()){
                ch = word2.charAt(helper2);
                helper2++;
                altarnate = altarnate + ch;
            }
        }
        return altarnate;
    }
}
