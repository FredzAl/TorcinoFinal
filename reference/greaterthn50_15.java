
/**
 * Write a description of class greaterthn50_15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class greaterthn50_15
{
    public static void main(String []args){
    Scanner rw = new Scanner(System.in);
    int[] arr = new int[5];
    for(int i=0;i<5;i++){
        System.out.print("Enter Number " + (i-1) + ":");
        arr[i] = rw.nextInt();
    }
    System.out.println("Numbers greater than 50:");
    for(int num : arr){
            if(num > 50){
            System.out.print(num + " ");
            }
        }   
        rw.close();
    }
}