package easy;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {


    public boolean isIsomorphic(String s, String t) {


        Map<Character, Character> tMapToS = new HashMap<>();
        Map<Character, Character> sMapToT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (sMapToT.containsKey(sc)) {
                if (sMapToT.get(sc) != tc) {
                    return false;
                }
            }
            if(tMapToS.containsKey(tc))
            {
                if(tMapToS.get(tc)!=sc)
                {
                    return false;
                }
            }
            sMapToT.put(sc, tc);
            tMapToS.put(tc, sc);



        }
        return true;
    }


}
