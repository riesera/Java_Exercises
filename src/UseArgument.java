//Program 1.1.2 Using a command-line argument
public class UseArgument {

    //1.1.6 Modify UseArgument to use three CMD arguments and print in reverse
    public static void UseThree(String a, String b, String c)
    {
        System.out.print("Hi " + c + ", " + b + ", and " + a + ".");
    }
    public static void main(String[] args)
    {
        /*

        System.out.print("Hi, ");
        System.out.print(args[0]);
        System.out.println(". How are you?");

         */

        UseThree(args[0], args[1], args[2]);
    }
}

/*
    1.15.
            a. Prints Hi, java. How are you? (Although I suspect this isn't
            supposed to work. Since I'm doing it in an IDE I think that's why)

            b. At line:1 char:18 java UseArgument @ Unrecognized token in source
            text.
            At line:1 char:20 java UseArgument & Unrecognized token in source text
            The ampsersand character is not allowed. The & operator is reserved for
            future use; wrap an ampersand in double quotation marks to pass it
            as part of a string.

            c. Prints Hi, 1234. How are you?

            d. Prints Hi, Bob. How are you?

            e. Prints Hi, Alice. How are you? Ignores Bob
 */
