package easy;

import java.util.ArrayList;
import java.util.List;

public class PascaleTriangle {
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> triangle = new ArrayList<>();

        for(int i=0;i<numRows;i++)
        {
            List<Integer> row = new ArrayList<>();
            if(i==0)
            {
                row.add(1);
            }
            else {
                List<Integer> prev = triangle.get(i-1);
                row.add(1);
                for(int j=0;j<prev.size();j++)
                {
                    row.add(prev.get(j-1)+prev.get(j));
                }
                row.add(1);
            }

            triangle.add(row);
        }

        return triangle;



    }

}
