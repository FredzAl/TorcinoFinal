
/**
 * Write a description of class StopLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StopLoop
{
   public static void main(String [] args){
    int[] arr = {2,4,6,7,8};
    int valueToFind = 7;
    for(int i=0; i<arr.length;i++){
        if(arr[i] == valueToFind){
            System.out.println("Found" + valueToFind + "at Index" + i);
            break;
            }
        }
    }
}