import java.util.Scanner;

public class slide35 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        final int a;
        final int b;
        try (Scanner ncc = new Scanner(System.in)) {
            System.out.println("nhap so nguyen duong so 1: ");
            System.out.println("nhap so nguyen duong so 2: ");
            a = ncc.nextInt();
            b = ncc.nextInt();

        }

        if (a > b)
            System.out.println("so nguyen nho hon la: " + b);
        else
            System.out.println("so nguyen nho hon la: " + a);

    }
}
