import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) throws Exception {
        int n, sum = 0, number;
        float trungbinhcong;
        System.out.println("nhap so nguyen duong: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("nhap so  thu: " + i);
            number = sc.nextInt();
            sum = sum + number;
        }
        trungbinhcong = sum / n;
        System.out.println("trung binh cong cua cac so nguyen la: " + trungbinhcong);
    }
}
