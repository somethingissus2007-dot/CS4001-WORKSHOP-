import java.util.Scanner;

/**
 * Write a description of class question2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question2
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade:\t");  
        int grade = input.nextInt();

        String result = (grade >= 40) ? "Pass" : "Fail";

        System.out.println("\nYour result is:\n\t" + result);
    }
}
