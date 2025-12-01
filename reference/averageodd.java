
/**
 * Write a description of class averageodd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class averageodd
{
    public static void main(String [] args){
    int[] arr= {3,4,7,8,5,10};
    int sum = 0;
    int count = 0;
    for(int num : arr){
        if(num % 2 !=0){
        sum +=num;
        count++;
        }
    }
    if(count > 0) {
        double average = (double) sum/ count;
        System.out.println("Average of odd numbers: " + average);
    } else{
        System.out.println("No odd numbers found.");
     }
    }
}