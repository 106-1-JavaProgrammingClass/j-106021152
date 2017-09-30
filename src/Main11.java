import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        int a = sum.nextInt();
        int b = sum.nextInt();
        int c = sum.nextInt();
        System.out.println(Math.max(Math.max(a,b),c));
        System.out.println(Math.min(Math.min(a,b),c));
    }
}
