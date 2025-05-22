package easy;

import java.util.ArrayList;
import java.util.List;

public class NumberOfSeniorCItizens {

    public int  countSeniors(String[] details) {

        int count=0;
        List<Integer> ages = new ArrayList<>();

        for (String p : details) {

                    String ageStr = p.substring(11, 13).trim();
                    int age = Integer.parseInt(ageStr);
                    if(age>60)
                    {
                        count++;
                    }


        }



        return count;
    }
}
