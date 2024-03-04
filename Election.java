import java.util.*;
import java.text.*;

public class Election {
    public static void main(String[] args) {
    int awbreyNY, awbreyNJ, awbreyCT;
    int martinezNY, martinezNJ, martinezCT;
    int totalMartinez, totalAwbrey, totalVotes;
    double percentAwbrey, percentMartinez;

    Scanner input = new Scanner (System.in);

    System.out.println("\nElection results from New York:");
    System.out.print("Awbrey:  "); 
    awbreyNY = input.nextInt();
    System.out.print("Martinez:");
    martinezNY = input.nextInt();

    System.out.println("\nElection results from New Jersey:");
    System.out.print("Awbrey:  "); 
    awbreyNJ = input.nextInt();
    System.out.print("Martinez:");
    martinezNJ = input.nextInt();

    System.out.println("\nElection results from Connecticut:");
    System.out.print("Awbrey:  "); 
    awbreyCT = input.nextInt();
    System.out.print("Martinez:");
    martinezCT = input.nextInt();

    totalMartinez = martinezNY + martinezNJ + martinezCT;
    totalAwbrey = awbreyNY + awbreyNJ + awbreyCT;
    totalVotes = totalMartinez + totalAwbrey;

    NumberFormat percent = NumberFormat.getPercentInstance();

    percentAwbrey = ((double)totalAwbrey/(double)totalVotes)*100;
    percentMartinez = ((double)totalMartinez/(double)totalVotes)*100;
    System.out.println(percentAwbrey+ "\t\t"+ percentMartinez);

    System.out.println("\nCandidate\tVotes Percentage");
    System.out.println("Awbrey\t\t"+ totalAwbrey + "\t" + percent.format(percentAwbrey));
    System.out.println("Martinez\t" + totalMartinez+ "\t" +percent.format(percentMartinez));
    System.out.println("\nTOTAL VOTES:\t"+totalVotes);
    
    }

}