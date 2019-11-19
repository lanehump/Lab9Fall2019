
/**
 * Write a description of class Asterisk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Asterisk
{
    public static void printAsterisk(int[] array){
        double largest = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > largest){
                largest = array[i];
            }
        }
        for(int i = 0; i < array.length; i++){
            long aCount = Math.round((40 * array[i]) / largest);
            while(aCount > 0){
                System.out.print("*");
                aCount--;
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the array");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Please enter your values");
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        printAsterisk(array);
    }
}
