import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        double a = sum.nextDouble();
       int n = sum.nextInt();
       System.out.println(Math.round(a*Math.pow(10,n))/Math.pow(10,n));
    }
}
