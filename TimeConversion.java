import java.util.*;
public class TimeConversion {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time in minutes: ");
        int minutes = input.nextInt();
        int newHours = minutes/60;
        int newMinutes0 = (minutes-(newHours*60))/10;
        int newMinutes1 = (minutes-(newHours*60))%10;
        System.out.println("The time is: "+ newHours + ":" + newMinutes0 + newMinutes1);
        input.close();
    }
}
