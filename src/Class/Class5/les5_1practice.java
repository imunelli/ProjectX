package Class.Class5;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by imunelli on 18.10.2015.
 */
public class les5_1practice {

    public static void main(String[] args) {

        //c:/Users/imunelli/ProjectX/t.txt
        //d:/t.txt
        try (BufferedReader reader = new BufferedReader(new FileReader("c:/Users/imunelli/ProjectX/t.txt"))) {
            ArrayList<String> list = new ArrayList<String>();
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
