import java.util.*;
import java.text.*;
public class Geometry {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input 2 positive integers where m>n.");
        System.out.print("Input m: ");
        int m = input.nextInt();
        System.out.print("Input n: ");
        int n = input.nextInt();

        int sideOne = (m*m)-(n*n);
        int sideTwo = 2*(m*n);
        int hypotenuse = (m*m) + (n*n);
        System.out.println("Pythagorean triple: "+sideOne+", "+ sideTwo+ ", "+ hypotenuse);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.print("Triple cost: "+money.format(sideOne*2.412)+", "+ money.format(sideTwo*3.767)+ ", "+ money.format(hypotenuse*15.758));
    }
}
