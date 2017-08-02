import java.util.Scanner;

public class area
    {

    public static void main(String[] args)
        {

        double r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a radius:");
        r = s.nextDouble();
        if (r < 0) {
            System.out.println("Please enter a positve number");
            }
        else {
            area = pi * r * r;
            System.out.println("The area of a circle of radius is:" + area);
            }

        }
    }