import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class bai3 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String chuoi;
        int a;
        System.out.println("nhap vao ten: ");
        Scanner sc = new Scanner(System.in);
        chuoi = sc.nextLine();
        System.out.println("nhap vao so tuoi: ");
        a = sc.nextInt();
        if (a < 16)
            System.out.println("ban " + chuoi + " o do tuoi vi thanh nien");
        if (16 <= a & a < 18)
            System.out.println("ban " + chuoi + " o do tuoi truong thanh");
        if (a >= 18)
            System.out.println("ban " + chuoi + " da gia");

    }
}
