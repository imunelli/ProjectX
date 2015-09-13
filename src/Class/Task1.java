package Class;

/**
 * Created by imunelli on 13.09.2015.
 */
public class Task1 {
    public static void main(String[] args)
    {
      for(int i = 0; i < 10; i++ )
      {
          System.out.println("i");
      }

       int i = 0;
      while (i < 10){
          System.out.println("Iii");
          i++;
      }
/**
 * инкремент до i = 5; ++i равнозначно i = i+1; i = 6;
 * инкремент после i = 5; i++, добавление происходит после показа переменной System.out.println("i++"); т.е на выходе только 5
 */

        int array[] = new int[10];
        /**  Обьявление массивов так же как и в С++
         * int array1[] = {1, 2, 3, 4};*/
        System.out.println(array.length);
        for (int l = 0; l<array.length; l++)
        {
            array[l] = l;
        }
     /**
        *for(int v : array){    нужен просто для прохода по элементам, не самый удобный цикл
         *   System.out.println(v);
        *}
       */
        for (int l = 0; l<array.length; l++)
        {
            System.out.println(array[l]);
        }

        //Условные операторы if/else, switch/case так же как и на с++

        int q = 2;
        switch (q){
        case 1:
            System.out.println(1);
            break;
        case 2:
            System.out.println(2);
            break;
        case 3:
            System.out.println(3);
            break;
    }
        //СТРОКИ
        String f = "Java";
        String f1 = new String("Java");
        String f2 = "Java";
        //сравнение строк
        System.out.println(f==f2);
        System.out.println(f1==f2);
        //сравнение строк по значению
        System.out.println(f.equals(f1));
        System.out.println(f.equals(f2));
        //
        String f3 =  f.replace("J", "G");
        System.out.println(f3);

        String s = "";
        for (int z = 0; z<11; z++)
        {
            s = s + z + " ";
        }
        System.out.println(s);












    }


}
