package Class;

import java.io.*;

/**
 * Created by imunelli on 04.10.2015.
 */
public class les4_1 {
    public static  void writeFile(){

        BufferedWriter writer = null;
        try {
            //BufferedReader reader = new BufferedReader(new FileReader("D:/file.txt"));

            writer = new BufferedWriter(new FileWriter("D:/jh/file.txt"));
            writer.write("asdasdas\n");
            writer.write("bnmbvnmvbndas\n");
            writer.write("asdasdas\n");
            writer.write("asdasdas\n");
            writer.write("asdasdas\n");

         //   writer.close();// запись в файл производится после этой строки, она закрывает запись
       // } catch (FileNotFoundException e) {
         //   e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(writer != null)
                {
                writer.close();}
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void doNothing() throws FileNotFoundException, IOException
    {

    }


    public static void main(String[] args)
    {
        writeFile();
        try {
            doNothing();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
