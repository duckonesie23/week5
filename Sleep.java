import java.util.*;
public class Sleep {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter thee day thy was borneth---");
        System.out.print("Year: ");
        int year = input.nextInt();
        System.out.print("Month: ");
        int month = input.nextInt();
        System.out.print("Day: ");
        int day = input.nextInt();
        System.out.print("Enter thee date of present--- ");
        System.out.print("Year: ");
        int yearCurrent = input.nextInt();
        System.out.print("Month: ");
        int monthCurrent = input.nextInt();
        System.out.print("Day: ");
        int dayCurrent = input.nextInt();
        int yearsAlive = ((yearCurrent - year)*365);
        int daysAlive = ((dayCurrent - day));
    }
}
