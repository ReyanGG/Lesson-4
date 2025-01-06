import java.util.Scanner;

public class PickDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number from 1 - 7");
        int d = sc.nextInt();

        switch (d) {
            case 1:
                System.out.println("its monday");
                break;

            case 2:
                System.out.println("its Tuesday");
                break;

            case 3:
                System.out.println("its Wednesday");
                break;

            case 4:
                System.out.println("its Thursday");
                break;

            case 5:
                System.out.println("its Friday");
                break;

            case 6:
                System.out.println("its Saturday");
                break;

            case 7:
                System.out.println("its Sunday");
                break;

            default:
                System.out.println("error");
        }
        sc.close();

    }

}
