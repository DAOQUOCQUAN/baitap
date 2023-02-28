import java.util.Scanner;

public class slide55 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" ");
        }
        for (int n = 0; n < 200; n++)

        {
            if (n % 5 == 0) {
                System.out.println(n + "");
            }
        }
    }

}
