import java.util.Scanner;

public class bai5 {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int number, tong = 0;
        try (Scanner sc = new Scanner(System.in)) {

            do {

                System.out.println("nhap vao 1 so nguyen ");
                number = sc.nextInt();
                tong += number;
            } while (tong < 100);
            int t = tong - number;
            System.out.println("tong cac so " + t + "+" + number + "=" + tong);

        }

    }
}
