import java.util.Scanner;

public class bai3 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String ten;
        int a;
        System.out.println("nhap vao ten: ");
        System.out.println("nhap vao so tuoi: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        ten = sc.nextLine();
        if (a < 16)
        System.out.println("ban"+ten "o do tuoi vi thanh nien");

    }
}
