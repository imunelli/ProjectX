package Class;

/**
 * Created by imunelli on 04.10.2015.
 */
            //обработка ошибок
public class les4_0 {
 public static void ex() { int f = 45 / 0; }


    public static void main(String[] args)
    {
        try {
            String s = null;
            s.compareTo("hello");
            //ex();
        }
        catch (ArithmeticException | NullPointerException e)
        {
            e.printStackTrace();
            System.out.println("hello");
        }

    }
}
