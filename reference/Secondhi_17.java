
/**
 * Write a description of class Secondhi_17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Secondhi_17
{
    public static void main(String [] args){
    int[] arr ={10,5,20,8,12};
    int highest = Integer.MIN_VALUE;
    int secondHighest = Integer.MIN_VALUE;
    for(int num : arr){
        if(num > highest){
            secondHighest = highest;
            highest = num;
        } else if(num > secondHighest && num != highest){
        secondHighest = num;
        }
    }  
    System.out.println("Second highest number: " + secondHighest);
    }
}