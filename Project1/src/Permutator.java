public class Permutator{
    String finResult = "";
    public String permute(String letters){
        if (letters.length() == 1){
            return letters;
        }
        else{
            for (int i = 0; i < letters.length(); i++){
                String result = "";
                String rest = letters.substring(0,i)+letters.substring(i+1);
                String prefix = letters.substring(i,i+1);
                return result += prefix + permute(rest);
                
            }
        }return result;
    }
}//char[] letter = letters.toCharArray();