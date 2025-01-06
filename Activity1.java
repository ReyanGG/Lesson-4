import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int n1 = sc.nextInt();

        System.out.println("enter number");
        int n2 = sc.nextInt();

        System.out.println("enter number");
        int n3 = sc.nextInt();

        int m = n1;
        int q = n1;

        if (m < n2) {
            m = n2;
        }
        if (m < n3) {
            m = n3;
        }
        System.out.println(m);

        if (q > n2) {
            q = n2;
        }
        if (q > n3) {
            q = n3;
        }
        System.out.println(q);

        if (m % 2 == 0 & q % 2 == 0) {
            System.out.println(m * m);
            System.out.println(q * q);
        } else if (m % 2 == 1 & q % 2 == 1) {
            System.out.println(m * m * m);
            System.out.println(q * q * q);

        } else {
            System.out.println("error");

        }
    }
}