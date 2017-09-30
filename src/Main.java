import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        int a = sum.nextInt();
        System.out.println(Math.round(a*1.6*10)/10d);
    }
}
