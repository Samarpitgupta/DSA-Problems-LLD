class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        // start backtracking from the beginning
        backtrack(resultList, new ArrayList<>(),nums, 0);
        return resultList;
    }

    private void backtrack(List<List<Integer>> resultSets, List<Integer> tempSet, int[] nums, int start)
    {
        // add set to the resultSet
        resultSets.add(new ArrayList<>(tempSet));
        for(int i = start; i<nums.length;i++)
        {
            // including the number
            tempSet.add(nums[i]);
            // backtrack the new subset
            backtrack(resultSets, tempSet, nums, i+1);
            // removing the number
            // case of not icluding the number
            tempSet.remove(tempSet.size()-1);
        }
    }
}