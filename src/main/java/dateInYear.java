import java.sql.SQLOutput;
import java.util.Scanner;

public class dateInYear {

    public static void main(String[] args) {
        Scanner number= new Scanner(System.in);
        System.out.println("Which month do u know the day");
        int month= number.nextInt();
        switch (month) {
            case 2 -> System.out.println("Thang 2 co 28 hoac 29 ngay");
            case 1, 3, 5, 7, 8, 10 -> System.out.println("Thang nay co 31 ngay");
            default -> System.out.println("Thang nay co 30 ngay");
        }
    }

}
