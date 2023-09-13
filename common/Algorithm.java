package CountCharacter.common;

import java.util.HashMap;
import java.util.StringTokenizer;

public class Algorithm {

  


    public void tachTu(String input) {
        StringTokenizer stringTokenizer = new StringTokenizer(input, " ");
        HashMap<String, Integer> demTu = new HashMap<>();
        while (stringTokenizer.hasMoreTokens()) {

            String tu = stringTokenizer.nextToken();
            if (!demTu.containsKey(tu)) {
                demTu.put(tu, 1);
            } else {
                demTu.put(tu, ((int) demTu.get(tu)) + 1);
            }
        }
         System.out.println(demTu);
    }



    public void tachKitu(String input) {
        input = input.replaceAll("\\s+", "");
        HashMap<Character, Integer> demKitu = new HashMap<>();
        for (Character kitu : input.toCharArray()) {
            if (!demKitu.containsKey(kitu)) {
                demKitu.put(kitu, 1);
            } else {
                demKitu.put(kitu, demKitu.get(kitu) +1);
            }
            
            
        }
        System.out.println(demKitu);
    }
    
    
    
}
