import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        float a = sum.nextFloat();
        System.out.println(Math.round(a/600*10)/10f);
    }
}
