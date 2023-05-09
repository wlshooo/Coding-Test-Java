package codeup_basic;
import java.util.Scanner;
public class q1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if((a==0&&b==0)) System.out.printf("%d",1);
        else System.out.printf("%d",0);
    }
}
