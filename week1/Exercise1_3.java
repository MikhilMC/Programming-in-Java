import java.util.Scanner;
public class Exercise1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        System.out.print("Even number divisible by 3:");
        int i = 0, j = 0;
        while(j < n) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
            i += 2;
            j++;
        }
        System.out.println();
        System.out.print(sum);
    }
}
