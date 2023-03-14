import java.util.Scanner;

public class bai12 {

    public static void main(String[] args) throws Exception {
        int sodong, socot;
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
            int max = A[0][0];
            for (int i = 0; i < sodong; i++) {
                for (int j = 0; j < socot; j++) {
                    if (max < A[i][j])
                        max = A[i][j];
                }
            }
            System.out.println("gia tri lon nhat cua ma tran la :" + max);
        }
    }
}
