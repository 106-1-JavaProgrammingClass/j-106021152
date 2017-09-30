import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        int c = sum.nextInt();
        int e = sum.nextInt();
        int m = sum.nextInt();
        System.out.println(Math.round(c+e+m));
        System.out.println(Math.round(c+e+m)/3);
    }
}
