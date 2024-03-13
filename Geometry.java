import java.util.*;
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
        System.out.print("Pythagrean triple: "+sideOne+", "+ sideTwo+ ", "+ hypotenuse);
    }
}
