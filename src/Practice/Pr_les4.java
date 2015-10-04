package Practice;

/**
 * Created by imunelli on 04.10.2015.
 */
public class Pr_les4 {




    public static void main(String[] args)
    {
        Box box = new Box(100);
        System.out.println(box.getT());
        box.setT(500);
        System.out.println(box.getT());
        try{
            box.setT(-500);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("fail fail");
        }

        System.out.println(box.getT());
        Box box2 = new Box(-100);
        System.out.println(box2.getT());

    }


}

class Box
{
    private double t;

    public Box (double t)
    {
        setT(t);
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {

            if(t < 0)
            {
                throw new IllegalArgumentException("Fail t < 0");
            }
        this.t = t;
    }
}
