import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        char kytu;
        int n = 0;
        do {
            System.out.println("nhap chuoi");
            chuoi = sc.nextLine();
        } while (chuoi.length() > 80);
        System.out.println("nhap ky tu can dem: ");
        kytu = sc.next().charAt(0);
        for (int i = 0; i < chuoi.length(); i++) {
            if (kytu == chuoi.charAt(i))
                n++;
        }
        System.out.println("so lan xuat hien ky tu " + kytu + " trong chuoi " + chuoi + " la: " + n + " lan");

    }
}
