//import java.util.*;
class Test{
    public static void main(String[] args){
        Permutator permute = new Permutator();
        String letters = "ab";
        //char[] letter = letters.toCharArray();
        //char let = letter[0];
        String fin = permute.permute(letters);
        System.out.print(fin);
    }
}