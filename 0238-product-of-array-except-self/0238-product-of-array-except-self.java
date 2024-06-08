class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        final int N = nums.length;
        for(int i=0; i<N; i++)
            product *= nums[i]; // product of ALL
        
        int[] answer = new int[N];
        for(int i=0; i<N; i++){
            if(nums[i]==0){
                answer[i] = ifZero(nums, i, N);
                continue;
            }
            answer[i] = product/nums[i];
        }
        return answer;
    }
    static int ifZero(int[] nums,int index, int N){
        int answer = 1;
        for(int i=0; i<N; i++){
            if(i==index) continue;
            answer*=nums[i];
        }
        return answer;
    }
}