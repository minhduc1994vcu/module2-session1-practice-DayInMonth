import java.util.Scanner;
public class DayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("which month do you want to check: ");
        int month = scanner.nextInt();

        String day_in_month;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:;
            case 8:
            case 10:
            case 12:
                day_in_month = "31";
                break;
            case 2:
                day_in_month = "28 or 29";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day_in_month = "30";
                break;
            default:
                day_in_month = "";
        }
        if (day_in_month != "") {

            System.out.printf("month %d has %s days", month, day_in_month);
        }
        else System.out.println("invalid input");

    }
}
