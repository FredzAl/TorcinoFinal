
/**
 * Write a description of class EvenGthan20_20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenGthan20_20
{
    public static void main(String [] args){
    int[] arr ={10,22,25,35,40,12,15,50};
     for(int num : arr){
        if(num > 20 && num % 2 ==0){
            System.out.print(num + " ");
        }
     }
    }
}