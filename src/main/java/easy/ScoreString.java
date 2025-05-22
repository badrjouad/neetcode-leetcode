package easy;

public class ScoreString {

        public int scoreString(String s)
        {
            char [] scharArray =  s.toCharArray();
            int sum=0;
            for(int i=0;i<scharArray.length-1;i++)
            {
                sum+=Math.abs(scharArray[i]-scharArray[i+1]);
            }


            return sum;
        }
}
