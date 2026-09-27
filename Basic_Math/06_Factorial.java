import java.util.Scanner;
class Solution {
    public int factorial(int n) {
        int num = n;
        int fact =1;
        if(num<0 && num==0) return 1;
        while(num>0){
            fact = fact*num;
            num --;
        }
        return fact;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        int num = sc.nextInt();
        int result = s.factorial(num);
        System.out.println(result);
    }
}