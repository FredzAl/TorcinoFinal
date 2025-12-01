
/**
 * Write a description of class Count7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Count7
{
       public static void main(String [] args){
        int[] arr = {7,2,7,4,5,7,7,8,9,7};
        int count = 0;
        for(int num : arr){
        if(num ==7){
            count++;
            
               }
        }
           System.out.println("Number 7 appaers " + count + " times. ");
        }
}