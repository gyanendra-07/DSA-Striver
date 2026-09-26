import java.util.Scanner;
class Solution {
    public int countOddDigit(int n) {
         int num = n;
        int count =0;
        while(num!=0){
            int digit = num % 10;
            if(digit%2!=0) count++;
            num = num/10;
        }
        return count;
    }
    public static void main(String[] args){
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int value = s.countOddDigit(num);
        System.out.print(value);

    }
    }