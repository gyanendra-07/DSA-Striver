import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int n) {
        int temp = n;
        int num =0;
        if(n<0) return false;
        while(n!=0){
            int digit = n%10;
            num = num*10 +digit;
            n/=10;    
        }
        if(temp==num ) return true;
        else 
        return false;
    }
    public static void main(String[] args){
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = s.isPalindrome(num);
        System.out.println(result);
    }
}