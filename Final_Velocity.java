import java.util.*;
public class Final_Velocity
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
                System.out.print("Enter initial velocity: ");
                double u = in.nextDouble(), v = 0.0;
                System.out.print("Enter acceleration: ");
                double a = in.nextDouble();
                System.out.print("Enter \'d\' if you have Distance and \'t\' if you have Time: ");
                char choice = in.next().charAt(0);
                switch (choice)
                {
                    case 'd':
                    {
                        System.out.print("Enter Distance: ");
                        double d = in.nextDouble();
                        v = Math.sqrt(u*u + 2*a*d);
                        break;
                    }
                    case 't':
                    {
                        System.out.print("Enter Time: ");
                        double t = in.nextDouble();
                        v = u + a*t;
                        break;
                    }
                    default:
                    {
                        System.out.println("Wrong choice!");
                        System.exit(0);
                    }
                }
                    System.out.println("The Final Velocity = "+v);
    }
}