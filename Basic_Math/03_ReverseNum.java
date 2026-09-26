import java.util.Scanner;
class Solution {
    public int reverseNumber(int n) {
        int num = n;
        int rev_num = 0;
        if(num ==0) return 0;
        while(num!=0){
            int digit = num % 10;
            rev_num = rev_num*10 + digit;
            num = num/10;
        }
        return rev_num;
    }
    public static void main(String [] args){
        Solution  s = new Solution();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int final_value = s.reverseNumber(num);
        System.out.print(final_value);
    }
}