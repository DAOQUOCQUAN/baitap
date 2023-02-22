import java.util.Scanner;

public class slide34 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        a = NhapSoNguyen("nhap he so a : ");
        b = NhapSoNguyen("nhap he so b : ");
        c = NhapSoNguyen("nhap he so c : ");
        GiaiPTbac2(a, b, c);
    }

    public static int NhapSoNguyen(String str) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        x = sc.nextInt();
        return x;
    }

    public static void GiaiPTbac2(int a, int b, int c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0)
                    System.out.println("phuong trinh co vo so nghiem");
                else
                    System.out.println("phuong trinh vo nghiem");
            } else
                System.out.println("phuong trinh co 1 nghiem x= " + (-c / b));
        } else {
            double x1;
            double x2;
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0)
                System.out.println("phuong trinh vo nghiem");
            else if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("phuong trinh co nghiem x1 = " + x1);
                System.out.println("phuong trinh co nghiem x2 = " + x2);
            } else
                System.out.println("phuong trinh co nghiem kep x1=x2= " + (-b / (2 * a)));
        }

    }

}
