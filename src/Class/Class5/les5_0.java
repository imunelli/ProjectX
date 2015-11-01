package Class.Class5;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by imunelli on 18.10.2015.
 */
public class les5_0 {
    public static void main(String[] args){
       // A a = new AImpl();

        //int - создаётся в стеке, раб. быстрее
        //integer - создаётся в хипе (вирт. машина джава)

        //структура данных LIST(список)
        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
       // list.add("piy piy"); для считывания строк нужно задать тип <String>

        //int y = list.get(4); при этой строке будет ошибка
        int y = (int)list.get(4);
        System.out.println(y);//правильное присвоение переменной элемента списка т.е. нужно задавать тип

        //System.out.println(list);
        Object object = list.get(4);


    }

    interface MyInterface{

    }

    abstract class A{

        abstract public void doSome();
    }

    class AImpl extends A{

        public void doSome(){
            System.out.println("Impl A");
        }
    }

}
