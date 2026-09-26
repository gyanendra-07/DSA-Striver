import java.util.Scanner;
class Solution {
    public int countDigit(int n) {
        int num = n;
        int count =0;
        if(num==0) return 0;
        while(num!=0){
            int digit = num % 10;
            count++;
            num=num/10;
        }
        return count;
    }

public static void main (String [] args){
    Solution s = new Solution();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int value = s.countDigit(n);
    System.out.println(value);
    
}
}