
/**
 * Write a description of class PassFail_13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassFail_13
{
    public static void main(String [] args){
    int[] grades = {80,70,90,65,75};
    int passed = 0;
    int failed = 0;
    for(int grade : grades){
        if(grade >=75){
        passed++;
        } else{
            failed++;
        }
    }
    System.out.println("Passed: " + passed);
    System.out.println("Failed: " + failed);
    }
}