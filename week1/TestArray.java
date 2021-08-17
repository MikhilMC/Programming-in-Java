import java.lang.*;

class TestArray {
    public static void main(String args[]) {

        int a[];       //Declaration
        a = new int[]{ 10, 20, 30, 40, 50 };    //Instantiation and initialization
        //Traversing array
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        //Average calculation
        float sum = 0, avg;
        for(int i = 0; i < a.length; i++)
            sum += a[i];
        avg = sum / a.length;
        System.out.println("Average = " + avg);
    }
}
