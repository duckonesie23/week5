import java.util.*;
public class NumbersSum {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an int: ");
        int num = input.nextInt();
        int count = 1;
        int sum = 0;

        while(num>=count){
            System.out.println(count);
            sum += count;
            count++;
        }
        System.out.println("Sum: " + sum);
        input.close();
    }
}
