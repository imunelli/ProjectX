package Homeworks.Task00;

/**
 * Created by imunelli on 06.09.2015.
 */
/**
 * Сделал так, потому ,что не придумал другого способа для проверки первого введённого числа
 */
import java.util.Scanner;
public class Task00 {
    public static void main(String[] args)
    {
        System.out.println("Enter number");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n % 3 == 0)
        {
            System.out.println("number "+n+" divided by 3");
        }
        else
        {
            System.out.println("number "+n+" is not divisible by 3");
        }
        while (n != 0)
        {
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            if(n % 3 == 0)
            {
                System.out.println("number "+n+" divided by 3");
            }
            else
            {
                System.out.println("number "+n+" is not divisible by 3");
            }
        }
        System.out.println("End of program");
    }
}
