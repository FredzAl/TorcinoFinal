
/**
 * Write a description of class Ref here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ref
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num;
        while(true){
            System.out.print("Enter a number from 1 to 100: ");
            num = sc.nextInt();
            if(num >=1 && num <= 100){
            break;
            }
            System.out.println("Invalid Input. Try again.");
            }
            System.out.println("Valid number entered:" + num);
            sc.close();
        } 
    }