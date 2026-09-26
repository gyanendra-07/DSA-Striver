import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
class Solution {
    public int largestDigit(int n) {
        int num = n;
        int t=0;
        ArrayList<Integer> Al = new ArrayList<>();
        if(num==0) return 0;
        while (num!=0){
            int digit = num % 10;
            Al.add(digit);
            num = num/10;

        }
        t = Collections.max(Al);
        return t;
        }
        public static void main(String[] args){
            Solution s = new Solution();
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int result = s.largestDigit(num);
            System.out.println(result);
        }
    }
