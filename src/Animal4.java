import java.util.Scanner;

public class Animal4 
{
    public void run(String name) 
    {
        System.out.println(name + " is running");
    }

    public static void main(String[] args) 
    {
        Animal4 jumbo = new Animal4();
        jumbo.run("Jumbo");
        jumbo.eat("Jumbo");

        Animal4 buzo = new Animal4();
        buzo.eat("Buzo");
        buzo.run("Buzo");
    }

    public void eat(String name) 
    {
        System.out.println(name + " is eating...!!");
    }
}