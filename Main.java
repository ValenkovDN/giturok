import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = (b * b) - (4 * a * c);

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("inf");
        } else if (d < 0) {
            System.out.println("0");
        } else if (d == 0) {
            System.out.println("1");
        } else if (d > 0) {
            System.out.println("2");
        }

        //int n = scan.nextInt();
        //String c =scan.nextLine();
    }
}