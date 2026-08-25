import java.util.Scanner;

public class Animal6 
{
    int no_of_eyes;
    String color;

    public void details(String name) 
    {
        System.out.println("-------Details of " + name + "-------");
        System.out.println("Eyes : " + no_of_eyes);
        System.out.println("Color : " + color);
    }

    public static void main(String[] args) 
    {
        Animal6 jumbo = new Animal6();
        jumbo.no_of_eyes = 2;
        jumbo.color = "Brown";
        jumbo.details("Jumbo");

        Animal6 buzo = new Animal6();
        buzo.no_of_eyes = 2;
        buzo.color = "Black";
        buzo.details("Buzo");
    }
}