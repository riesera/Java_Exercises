//Program 1.1.1 Hello, World
public class HelloWorld {

    public static void printHelloXTimes(int x)
    {
        for(int i = 0; i < x; i++)
        {
            System.out.println("Hello, World");
        }
    }

     public static void main(String[] args)
    {
        //Prints "Hello, World" in the terminal window.
        //System.out.println("Hello, World");

        printHelloXTimes(10);
    }
}

/* 1.1.2
            a. If you leave out public you get
            Error: Main method not found in class HelloWorld,
            please define the main method as:

            b. If you leave out static you get
            Error: Main method is not static in class HelloWorld,
            please define the main method as:

            c. If you leave out void you get
            java: invalid method declaration; return type required

            d. If you leave out args you get
            java: <identifier> expected
    1.1.3
            a. If you misspell public you get
            java: <identifier> expected

            b. Same for if you misspell static

            c. If you misspell void you get
            java: cannot find symbol
            symbol: class vid
            location: class HelloWorld

            d. If you misspell args to ags, it weirdly
            somehow still runs??

    1.1.4. You get the following error
    java: unclosed string literal. Also in an IDE it just auto corrects it
     */