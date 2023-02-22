import java.util.Scanner;

public class slide30 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int n;
        int tong = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("nhap vao 1 so nguyen duong: ");
            n = sc.nextInt();
        }

        while (n > 0) {
            tong += n % 10;
            n = n / 10;
        }
        System.out.println("tong cac chu so = " + tong);
    }
}