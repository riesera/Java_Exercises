public class BooleanQuestions {

    public static boolean TrueOrFalse()
    {
        /*This is for question 1.2.3. It always evaluates to true because of the || between !(a && b) && (a ||b)
        and ((a && b) || (!(a || b)) If one side is false, the other side will be true and because it's an or statment
        the overall result will be true
        */

        boolean a = true;
        boolean b = true;

        System.out.println("If a and b are both true the values are: ");
        System.out.println(" !(a && b) " + !(a && b));
        System.out.println("!(a && b) && (a || b)) " + (!(a && b) && (a || b)));
        System.out.println("!(a && b) && (a || b)) || ((a && b) " + (!(a && b) && (a || b) || ((a && b))));
        System.out.println("!(a && b) && (a || b)) || ((a && b) || !(a || b)) " + (!(a && b) && (a || b) || ((a && b) || !(a || b))));

        a = false;
        System.out.println("If a is false and b is true the values are: ");
        System.out.println(" !(a && b) " + !(a && b));
        System.out.println("!(a && b) && (a || b)) " + (!(a && b) && (a || b)));
        System.out.println("!(a && b) && (a || b)) || ((a && b) " + (!(a && b) && (a || b) || ((a && b))));
        System.out.println("!(a && b) && (a || b)) || ((a && b) || !(a || b)) " + (!(a && b) && (a || b) || ((a && b) || !(a || b))));

        a = true;
        b = false;
        System.out.println("If a is true and b is false the values are: ");
        System.out.println(" !(a && b) " + !(a && b));
        System.out.println("!(a && b) && (a || b)) " + (!(a && b) && (a || b)));
        System.out.println("!(a && b) && (a || b)) || ((a && b) " + (!(a && b) && (a || b) || ((a && b))));
        System.out.println("!(a && b) && (a || b)) || ((a && b) || !(a || b)) " + (!(a && b) && (a || b) || ((a && b) || !(a || b))));

        a = false;
        System.out.println("If a and b are both false the values are: ");
        System.out.println(" !(a && b) " + !(a && b));
        System.out.println("!(a && b) && (a || b)) " + (!(a && b) && (a || b)));
        System.out.println("!(a && b) && (a || b)) || ((a && b) " + (!(a && b) && (a || b) || ((a && b))));
        System.out.println("!(a && b) && (a || b)) || ((a && b) || !(a || b)) " + (!(a && b) && (a || b) || ((a && b) || !(a || b))));
        return (!(a && b) && (a || b)) || ((a && b) || !(a || b));
    }

    public static void main(String[] args)
    {
        boolean mine = TrueOrFalse();
    }
}
