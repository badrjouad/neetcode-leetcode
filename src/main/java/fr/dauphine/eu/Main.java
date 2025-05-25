package fr.dauphine.eu;
import easy.arrays.KthDistinctStringInArray;
import easy.arrays.LongestMonoticSubArray;
import easy.arrays.NumArray;


public class Main {
    public static void main(String[] args) {

        int left=2;
        int right =5;
        int [] nums = new int[]{1,2,3,4,5};
        NumArray obj = new NumArray(nums);
        int param_1 = obj.sumRange(left,right);



    }
}
