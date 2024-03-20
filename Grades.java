import java.util.*;
public class Grades {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your grade: ");
        int grade = input.nextInt();
        char gradeLetter;

        if(grade>= 90){
            gradeLetter = 'A';
            System.out.println(gradeLetter+"-mazing! I'm taking you out for dinner!");
        }
        if(grade>= 80 && grade<90){
            gradeLetter = 'B';
            System.out.println(gradeLetter+"-ud, you'll get him next time");
        }
        if(grade>= 70 && grade<80){
            gradeLetter = 'C';
            System.out.println(gradeLetter+"-ome on did you even study?");
        }
        if(grade>= 60 && grade<70){
            gradeLetter = 'D';
            System.out.println(gradeLetter+"-ude are you trying??");
        }
        if(grade<60){
            gradeLetter = 'F';
            System.out.println(gradeLetter+"-ind a new family >:(");
        }
        input.close();
    }
}
