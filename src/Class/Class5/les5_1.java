package Class.Class5;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by imunelli on 18.10.2015.
 */
public class les5_1 {

    public static void main(String[] args){


        try (BufferedReader reader = new BufferedReader(new FileReader("c:/Users/imunelli/ProjectX/t.txt"))) {

            //LinkedList<String> list = new LinkedList<String>();//хранит набор указателей
            List <String> list = new LinkedList<String>();//new ArrayList<String>();

            String str;

            while ((str = reader.readLine()) != null) {

                if(str.trim().length() > 0){
                    list.add(str);
                }
            }
            for(String s: list){
                System.out.println(s);}

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Warning!!");
        }

    }



}

    class MyList<I> implements List<I> {

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<I> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(I i) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends I> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends I> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public I get(int index) {
            return null;
        }

        @Override
        public I set(int index, I element) {
            return null;
        }

        @Override
        public void add(int index, I element) {

        }

        @Override
        public I remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<I> listIterator() {
            return null;
        }

        @Override
        public ListIterator<I> listIterator(int index) {
            return null;
        }

        @Override
        public List<I> subList(int fromIndex, int toIndex) {
            return null;
        }
    }