import java.util.Scanner;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j] == target)
                {
                    arr[0]=i;
                    arr[1]=j;
                   // break;
                }
            }
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=s.nextInt();
        }
        int target=s.nextInt();
        System.out.println(twoSum(nums,target));
    }
}