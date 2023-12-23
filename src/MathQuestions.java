public class MathQuestions {

    public static double sinSquaredPlusCosSquared(double theta)
    {   /* This is for question 1.2.2. The value returned is not always 1.0 for all theta values because some require
    higher precision than the computer can offer to actually get to 1.0 so instead it comes really close like 0.9999
    */
        return Math.pow(Math.sin(theta), 2) + Math.pow(Math.cos(theta), 2);
    }

    public static void main(String[] args)
    {
        System.out.println(sinSquaredPlusCosSquared(Double.parseDouble(args[0])));
    }
}
