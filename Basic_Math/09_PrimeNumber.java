import java.util.Scanner;
class Solution {
    public boolean isPrime(int n) {
        if(n<=1) return false;
       for(int i =2;i<Math.sqrt(n);i++){
        if(n%i==0) return false;
       }
       return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        int num = sc.nextInt();
        boolean result = s.isPrime(num);
        System.out.print(result);
    }
}