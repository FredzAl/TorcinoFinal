
/**
 * Write a description of class Countdig_16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Countdig_16
{
    public static void main(String []args){
    Scanner wa = new Scanner(System.in);
    System.out.print("Enter a number: ");
    String input = wa.nextLine();
        if(input.startsWith("-")) {
            input = input.substring(1);
        }        
        System.out.println("Number of digits: " + input.length());
        wa.close();
    }
}
