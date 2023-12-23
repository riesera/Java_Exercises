public class Questions {

    public static void allNumbersTheSame()
    {   /*This is for question 1.2.1 and is code that just makes all the variables equal to a.
        */

        int t = 1;
        int a = 2;
        int b = 3;

        System.out.println("The values of t, a and b are: " + t + " " + a + " " + b);
        t = a;
        System.out.println("The value of t is now a: " + t);
        b = t;
        System.out.println("The value of b is now t: " + b);
        a = b;
        System.out.println("The value of a is now b: " + a);
        System.out.println("I'm pretty sure this code just makes all the values equal to a");
        System.out.println("The values of t, a and b are: " + t + " " + a + " " + b);

    }

    public static void main(String[] args)
    {

    }
}
