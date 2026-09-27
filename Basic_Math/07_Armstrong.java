import java.util.Scanner;
class Solution {
    public boolean isArmstrong(int n) {
        int num = n;
        int sum = 0;
        while(num!=0){
            int digit = num%10;
            sum += Math.pow(digit,3);
            num = num/10;
        }
        if(sum == n) return true;
        else
        return false;
    }
    public static void main(String [] args){
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = s.isArmstrong(n);
        System.out.print(result);
    }
}