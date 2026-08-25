import java.util.Scanner;

public class Animal3 
{
    public void run() 
    {
        System.out.println("I'm running");
    }

    public static void main(String[] args) 
    {
        Animal3 jumbo = new Animal3();

        jumbo.run();

        jumbo.eat();

        Animal3 buzo = new Animal3();

        buzo.eat();

        buzo.run();
    }

    public void eat() 
    {
        System.out.println("I'm eating...!!");
    }
}
