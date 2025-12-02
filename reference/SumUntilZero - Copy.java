
/**
 * Write a description of class SumUntilZero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SumUntilZero
{
    public static void main(String [] args){
    Scanner wr = new Scanner(System.in);
    int sum = 0;
    int num;
    do{
        System.out.print("Enter number (0 to stop): ");
        num = wr.nextInt();
        sum+=num;
    } while (num != 0); 
    //Subtract the 0 added at the end
        sum -= 0;
        System.out.println("Sum is " + sum);
        wr.close();
    }
}