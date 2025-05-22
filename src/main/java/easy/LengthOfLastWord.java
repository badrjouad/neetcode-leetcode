package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        int count = 0;

        String trim = s.trim();
        for(int i=trim.length()-1;i>=0;i--)
        {
            if(trim.charAt(i)==' ')
            {
                return count;
            }
            count++;
        }

        return count;


    }
}
