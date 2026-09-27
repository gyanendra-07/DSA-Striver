import java.util.Scanner;
class Solution {
    public boolean isPerfect(int n) {
        int sum =0;
        int i = n/2;
        
        while(i>0){
            if(n%i==0) sum +=i;
            i--;
        }
        if(sum == n) return true;
        else return false;
    }
    public static void main(String[] args){
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = s.isPerfect(num);
        System.out.print(result);
        
    }
}