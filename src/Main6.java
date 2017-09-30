import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        String str = sum.next();
        char ch =sum.next().charAt(0);
        System.out.println(str.replace(ch,'\n'));
    }
}
