import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
       int result=0;
       int temp = n, sum = 0;
       while(temp > 0) {
           sum += Math.pow(temp%10, 3);
           temp /= 10;
       }
       if(sum == n) {
           result = 1;
       }
       System.out.print(result);
    }
}
