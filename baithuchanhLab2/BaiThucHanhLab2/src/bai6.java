import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) throws Exception {
        int a;
        System.out.println("nhap vao so nguyen: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int giaithua = 1;
        for (int i = 1; i <= a; i++)
            giaithua = giaithua * i;
        System.out.println("giai thua cua so a la: " + giaithua);
    }
}
