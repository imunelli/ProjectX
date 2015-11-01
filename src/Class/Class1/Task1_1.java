package Class;

/**
 * Created by imunelli on 13.09.2015.
 */

public class Task1_1 {
    public static void main(String[] args) {
        int[][] a1 = new int[3][2];
        a1[0][0] = 1;
        a1[0][1] = 1;
        a1[1][1] = 1;
        a1[2][1] = 1;
        a1[2][0] = 1;
        NDarray.print(a1);

        int[][] a2 = new int[4][];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = new int[i + 1];
        }
        NDarray.print(a2);

       // NDarray.upd(a2);

        NDarray.print(a2);

    }


}

class NDarray {
    public static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%d", a[i][j]);
            }
            System.out.println();
        }
    }
}
