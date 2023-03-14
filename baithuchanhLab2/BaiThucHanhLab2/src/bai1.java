import java.util.Scanner;

import javax.sql.rowset.spi.SyncFactory;

public class bai1 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        float a, b, tong, hieu, tich, thuong;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so nguyen");
        a = sc.nextFloat();
        b = sc.nextFloat();
        tong = a + b;
        tich = a * b;
        if (a > b)
            hieu = a - b;
        else
            hieu = b - a;

        thuong = a / b;
        int du = (int) (a % b);
        System.out.println("tong 2 so la: " + tong);
        System.out.println("hieu 2 so la: " + hieu);
        System.out.println("tich 2 so la: " + tich);
        System.out.println("thuong 2 so la: " + thuong);
        System.out.println("du 2 so la: " + du);
        if (a > b) {
            System.out.println("so lon hon la a=: " + a);
            System.out.println("so nho hon la b=: " + b);
        } else {
            System.out.println("so lon hon la b=: " + b);
            System.out.println("so nho hon la a=: " + a);
        }
        if (a == b)
            System.out.println("2so bang nhau a=b=: " + a);
    }
}
