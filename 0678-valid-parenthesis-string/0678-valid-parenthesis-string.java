class Solution {
    
public boolean checkValidString(String s) {
    int low = 0; // Min possible open left brackets
    int high = 0; // Max possible open left brackets
    
    for (char c : s.toCharArray()) {
        if (c == '(') {
            low++;
            high++;
        } else if (c == ')') {
            low--;
            high--;
        } else { 
            low--; 
            high++; 
        }
        
        if (high < 0) return false; 
        if (low < 0) low = 0;
    }
    
    return low == 0;
}
}