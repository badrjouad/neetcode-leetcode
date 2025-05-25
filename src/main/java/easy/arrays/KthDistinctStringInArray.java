package easy.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class KthDistinctStringInArray {
    public String kthDistinct(String[] arr, int k) {


        Map<String,Integer> map=new LinkedHashMap<>();

        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int count=0;
        for(Map.Entry<String, Integer> m : map.entrySet())
        {

            if(m.getValue()==1)
            {
                count++;
                if(count==k)
                {
                    return m.getKey();
                }

            }

        }
        return "";
    }
}
