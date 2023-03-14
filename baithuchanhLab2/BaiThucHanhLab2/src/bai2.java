import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) throws Exception {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so nguyen: ");
        a = sc.nextInt();
        if (a % 2 == 0)
            System.out.println("So da cho la so chan");
        else
            System.out.println("So da cho la so le");
    }
}
