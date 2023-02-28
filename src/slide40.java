import java.util.Scanner;

public class slide40 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int number = 1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("nhap vao 1 so nguyen ");
            number = sc.nextInt();
        }

        switch (number) {
            case 1:
                System.out.println("chu nhat ");
                break;
            case 2:
                System.out.println("thu hai ");
                break;
            case 3:
                System.out.println("thu ba ");
                break;
            case 4:
                System.out.println("thu tu ");
                break;
            case 5:
                System.out.println("thu nam ");
                break;
            case 6:
                System.out.println("thu sau ");
                break;
            case 7:
                System.out.println("thu bay ");
                break;
        }

    }
}
