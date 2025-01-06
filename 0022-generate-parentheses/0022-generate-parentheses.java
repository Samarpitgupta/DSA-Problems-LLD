class Solution {
    public List<String> generateParenthesis(int n) {
        
    List<String> result = new ArrayList<>(); // initialize the result list
        generate(result, "", n, n); // call the recursive helper function
        return result; // return the result list
    }
    
    public void generate(List<String> result, String s, int left, int right){
        if(left == 0 && right == 0){ // base case: no more parentheses to add
            result.add(s); // add the generated string to the result list
            return; // exit the current recursive call
        }
        if(left > 0){ // if there are still left parentheses to add
            generate(result, s + "(", left - 1, right); // add a left parenthesis and recursively call the function
        }
        if(right > left){ // if there are still right parentheses to add and there are more left parentheses than right parentheses in the current string
            generate(result, s + ")", left, right - 1); // add a right parenthesis and recursively call the function
        }
    }
}