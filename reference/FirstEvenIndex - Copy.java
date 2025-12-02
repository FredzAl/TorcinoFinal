
/**
 * Write a description of class FirstEvenIndex here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FirstEvenIndex
{
    public static void main(String [] args){
    int[] arr = {1,3,5,8,10};
    int index = -1;
        for(int w=0; w<arr.length; w++){
        if(arr[w] % 2 == 0){
            index = w;
            break;
             }
    }
        if(index != -1){
        System.out.println("First Even number at Index " + index);
        } else {
        System.out.println("No Even number Found");
    }
   }
}
