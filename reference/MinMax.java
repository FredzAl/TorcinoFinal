
/**
 * Write a description of class MinMax here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MinMax
{
    public static void main(String [] args){
    int[] arr= {9,2,15,3,7};
    int smallest = arr[0];
    int largest = arr[0];
    
    for(int i=1; i < arr.length; i++){
        if(arr[i] < smallest){
            smallest = arr[i];
        }
        if(arr[i] > largest){
            largest = arr[i];
        }
    }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}