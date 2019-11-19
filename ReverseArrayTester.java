
/**
 * Write a description of class ReverseArrayTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class ReverseArrayTester
{
    public static void main(String[]args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] second = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(second));
        ReverseArray.reverseElements(numbers);
        ReverseArray.reverseElements(second);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(second));
    }
}
