import java.util.Scanner;

public class Animal5 
{
    public void run(String name, int distance_km) 
    {
        System.out.println(name + " has run " + distance_km + " km");
    }

    public static void main(String[] args) 
    {
        Animal5 jumbo = new Animal5();
        jumbo.run("Jumbo", 5);
        jumbo.eat("Jumbo", "grass");

        Animal5 buzo = new Animal5();
        buzo.eat("Buzo", "meat");
        buzo.run("Buzo", 12);
    }

    public void eat(String name, String dish) 
    {
        System.out.println(name + " is eating " + dish);
    }
}