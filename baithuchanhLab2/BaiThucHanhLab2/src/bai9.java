import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao mot chuoi bat ky: ");
        String s = sc.nextLine();
        int kytu = 0;
        int kytuhoa = 0;
        int chuso = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                kytu++;
            } else if (Character.isUpperCase(c)) {
                kytuhoa++;
            } else if (Character.isDigit(c)) {
                chuso++;
            }
        }
        System.out.println("so ky tu trong chuoi: " + kytu);
        System.out.println("So ky tu hoa trong chuoi: " + kytuhoa);
        System.out.println("So ky tu chu so trong chuoi: " + chuso);
    }
}
