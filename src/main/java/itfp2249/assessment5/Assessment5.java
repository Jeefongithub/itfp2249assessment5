/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package itfp2249.assessment5;
import java.util.Scanner;

/**
 *
 * @author jmazzie
 */
public class Assessment5 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int array[] = new int[5];
        
        System.out.println("Teacher's Copy");
        
        System.out.print("Please enter Five Integers: ");
        
        for (int enter=0; enter<array.length; enter++)
        {
            array[enter] = input.nextInt();
        }
        
        int high = array[0];
        for (int enter=1; enter<array.length; enter++)
        {
            if (array[enter]>high)
            {
                high=array[enter];
            }
        }
        System.out.println("Highest Integer is " + high);
        
        int low = array[0];
        for (int enter = 1; enter < array.length; enter++)
        {
            if (array[enter]<low)
            {
                low = array[enter];
            }
        }
        System.out.println("Lowest integer is " + low);
    }
}
