
/**
 * Write a description of class Countvalocc_12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Countvalocc_12
{
    public static void main(String [] args){
    int[] arr= {2,7,7,4,7,6};
    int value = 7;
    int count = 0;
    for(int num : arr){
        if(num == value){
            count++;
        }
    }
    if(count >= 3){
        System.out.println(value + " appears at least 3 times: ");
    } else{
     System.out.println(value + " appears less than 3 times: ");
    }
  }
}