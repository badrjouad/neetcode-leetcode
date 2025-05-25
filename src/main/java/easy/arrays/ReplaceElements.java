package easy.arrays;

public class ReplaceElements {
    public int[] replaceElements(int[] arr) {

        int max =-1;


        //max=7
        for(int i=arr.length-1;i>=0;i--)
        {
                int current=arr[i];
                arr[i]=max;
                max=Math.max(max,current);





        }
        return arr;
    }
}


