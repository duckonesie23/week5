import java.util.*;
import java.text.*;
public class Sleep {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter thee day thy was borneth---");
        System.out.print("Year: ");
        int year = input.nextInt();
        System.out.print("Month: ");
        int month = input.nextInt();
        System.out.print("Day: ");
        int day = input.nextInt();
        System.out.println("Enter thee date of present--- ");
        System.out.print("Year: ");
        int yearCurrent = input.nextInt();
        System.out.print("Month: ");
        int monthCurrent = input.nextInt();
        System.out.print("Day: ");
        int dayCurrent = input.nextInt();
        int timeAlive = ((yearCurrent - year)*365) + ((monthCurrent - month)*30) + (dayCurrent - day);
        NumberFormat number = NumberFormat.getIntegerInstance();
        System.out.println("You have been alive for " + number.format(timeAlive) + " days.");
        System.out.println("You have slept for " + number.format(timeAlive*8)+ " hours.");
        input.close();
    }
}
