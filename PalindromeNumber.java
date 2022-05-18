class Solution {
    public boolean isPalindrome(int x) {
 
        if (x == 0) return true;
        if (x < 0) return false;
        return x == reverse(x);
    
    }
    
    private static int reverse(int num) {
    int res = 0;
    while (num != 0) {
    res = (res * 10) + (num % 10);
    num = num / 10;
    }
    return res;
    }
}
