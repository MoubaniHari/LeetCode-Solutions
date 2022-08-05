class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ansList = new ArrayList<>(); //ArrayList to store the answer
        
        for(int i = 0; i<nums1.length; i++){  //Runs through the first array
            for(int j = 0; j<nums2.length; j++){ //Runs through the second array
                if(nums1[i] == nums2[j] && !ansList.contains(nums1[i])){
                        ansList.add(nums1[i]);
                        break;
                    }
            }
        }
        
        int [] ans = new int[ansList.size()]; //Creates the answer array and fills it with the ArrayList
        for(int i = 0; i<ans.length; i++) {
			ans[i] = ansList.get(i);
		}
        return ans;
        
    }
}
