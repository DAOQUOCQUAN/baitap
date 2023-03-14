import java.util.Scanner;

public class bai11 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("nhap vao kich thuoc mang: ");
            n = sc.nextInt();
        } while (n <= 0);
        int arrA[] = new int[n];
        for (int i = 0; i < arrA.length; i++) {
            System.out.println("nhap vao gia tri cua mang");
            arrA[i] = sc.nextInt();
        }
        System.out.println("day so ban dau la: ");
        show(arrA);
        sortASC(arrA);
        System.out.println("day so duoc sap xep tang dan la: ");
        show(arrA);
    }

    private static void show(int[] arrA) {
        for (int i = 0; i < arrA.length; i++) {
            System.out.println(arrA[i] + " ");

        }
    }

    private static void sortASC(int[] arrA) {
        int max = arrA[0];
        for (int i = 0; i < arrA.length - 1; i++) {
            for (int j = i + 1; j < arrA.length; j++) {
                if (arrA[i] > arrA[j]) {
                    max = arrA[j];
                    arrA[j] = arrA[i];
                    arrA[i] = max;
                }
            }
        }

    }
}
