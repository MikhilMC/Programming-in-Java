import java.util.Scanner;
public class Exercise1_5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mark_avg;
        int result;
        int i;
        int s;
        //define size of array
        s = input.nextInt();
        //The array is defined "arr" and inserted marks into it.
        int[] arr = new int[s];
        for(i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        int sum = arr[0];
        result = arr[0];
        for(i=1;i<arr.length;i++)
        {
            sum += arr[i];
            if(result < arr[i])
            {
                result = arr[i];
            }
        }
        mark_avg = sum / arr.length;
        System.out.println(result);
        System.out.print(mark_avg);
    }
}
