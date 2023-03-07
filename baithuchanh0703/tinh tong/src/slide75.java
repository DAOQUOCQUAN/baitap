import java.util.Scanner;

public class slide75 {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int sodong, socot, tong = 0;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("nhap kich thuoc so dong :");
                sodong = sc.nextInt();
            } while (sodong <= 0);
            do {
                System.out.println("nhap kich thuoc so cot :");
                socot = sc.nextInt();
            } while (socot <= 0);
            int A[][] = new int[sodong][socot];
            for (int i = 0; i < sodong; i++) {
                for (int j = 0; j < socot; j++) {
                    System.out.printf("nhap vao phan tu thu A[%d][%d]", i, j);
                    A[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < sodong; i++) {
                for (int j = 0; j < socot; j++) {
                    if (A[i][j] % 2 == 0)
                        tong = tong + A[i][j];
                }
            }
            System.out.printf("tong cac so chan cua mang la" + tong);
        }
    }
}