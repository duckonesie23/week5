/**************************
 * Name: Max Bondoc
 * Date: 3/13/2024
 * Application: Building
 */
import java.util.*;
import java.text.*;
public class Building {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of poles: ");
        int poles = input.nextInt();
        double cylinderVolume = 3.14*(1.5*1.5)*5;
        double totalVolumeFeet = cylinderVolume * poles;
        double totalVolumeYards = totalVolumeFeet / 27.0;
        double cost = totalVolumeYards * 12.98;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("Total volume in feet: "+totalVolumeFeet);
        System.out.println("Total volume in yards: "+totalVolumeYards);
        System.out.println("Total cost: "+money.format(cost));
        input.close();
    }
}
