import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        int n;
        int tong = 0;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("nhap vao kich thuoc mang: ");
                n = sc.nextInt();
            } while (n <= 0);
            int arrA[] = new int[n];
            for (int i = 0; i < arrA.length; i++) {
                System.out.println("nhap vao gia tri cua mang");
                arrA[i] = sc.nextInt();
            }
            for (int i = 0; i < arrA.length; i++) {
                if (arrA[i] % 2 == 0)
                    tong = tong + arrA[i];
            }
            System.out.println("gia tri cua tong la :" + tong);
        }
    }
}
