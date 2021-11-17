/*

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

*/





class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
        
    }
    
    public String build(String s){
        
        Stack<Character> ans= new Stack();
        for(char c: s.toCharArray()){
            if(c!='#')
                ans.push(c);
            else if(!ans.empty())
                ans.pop();
            
            
        }
        return String.valueOf(ans);
    }
}


Time Complexity: O(M + N)O(M+N), where M, NM,N are the lengths of S and T respectively.

Space Complexity: O(M + N)O(M+N).

