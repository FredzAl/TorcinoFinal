
/**
 * Write a description of class ConNiggative here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ConvertNegative
{
    public static void main(String [] args){
    int[] arr = {-1,3,-5,7,-9};
    for(int i=0; i< arr.length; i++){
        if(arr[i] < 0){
            arr[i] = -arr[i];
        }
    }
    for(int num : arr) {
        System.out.print(num + " ");
       }
    }
}
