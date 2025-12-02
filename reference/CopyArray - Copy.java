
/**
 * Write a description of class CopyArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CopyArray
{
   public static void main(String []args){
    int[] A = {1,2,3,4};
    int[] B = new int[A.length];
    for(int i=0; i < A.length; i++) {
        B[i] = A[i];
    }
    for(int num : B){
        System.out.print(num + " ");
    }
  }
}