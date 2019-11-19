
/**
 * Write a description of class ReverseArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReverseArray
{
    public static void reverseElements(int[] reference){
        int i = 0;
        int j = reference.length - 1;
        int temp;
        while(i < j){
            temp = reference[i];
            reference[i] = reference[j];
            reference[j] = temp;
            i++;
            j--;
        }
    }
}
