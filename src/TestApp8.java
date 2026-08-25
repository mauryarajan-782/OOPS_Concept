import java.util.Scanner;

class Animal8
{
    void run() 
    {
        System.out.println("I'm running");
    }
}

class Birds8 
{
    void fly() 
    {
        System.out.println("I'm flying");
    }
}

public class TestApp8 {
    public static void main(String[] args) 
    {
        Animal8 buzo = new Animal8();
        buzo.run();

        Birds8 sparrow = new Birds8();
        sparrow.fly();
    }
}