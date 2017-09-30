import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        String str = sum.nextLine();
        char chOld =sum.next().charAt(0);
        char chNew =sum.next().charAt(0);
        System.out.println(str.replace(chOld,chNew));

    }
}
