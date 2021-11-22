import java.util.Scanner;
public class Distance
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
                double s , u , v = 0.0 ,a, t;
                char a1,a2,a3,a4;
                System.out.print("Enter Acceleration: ");
                a=in.nextDouble();           
                System.out.println("Is your initial velocity non-zero??");
                System.out.print("Enter 'y' for yes and 'n' for no (no when its 0): ");
                a1=in.next().charAt(0);
                switch(a1)
                {
                    case('y'):
                {
                    System.out.print("Enter Initial Velocity: ");
                    u=in.nextDouble();
                    System.out.println("Do you have Time or Final Velocity?");
                    System.out.print("Enter 't' for Time and 'v' for Final velocity: ");
                    a2=in.next().charAt(0);
                    switch(a2)
                    {
                    case('t'):
                    {
                    System.out.print("Enter Time: ");
                    t=in.nextDouble();
                    s=(u*t) + (1.0/2.0 * a * t * t);
                    System.out.println("Distance is :" + s);
                    break;
                    }
                    case('v'):
                    {
                        System.out.print("Enter Final Velocity: ");
                        v=in.nextDouble();
                        s=((v*v) -(u*u))/ 2*a;
                        System.out.println("Distance is: "+s);
                        break;
                    }
                    }
                }
                break;
                    case('n'):
                {
                    System.out.println("Do you have Time or Final Velocity?");
                    System.out.print("Enter 't' for time and 'v' for final velocity: ");
                    a2=in.next().charAt(0);
                    switch(a2)
                    {
                    case('t'):
                    {
                    System.out.print("Enter Time: ");
                    t=in.nextDouble();
                    s=(1.0/2.0 * a * t * t);
                    System.out.println("Distance is : " + s);
                    break;
                    }
                    case('v'):
                    {
                    
                        System.out.print("Enter Final Velocity: ");
                        v=in.nextDouble();
                        s=(v*v)/ 2*a;
                        System.out.println("Distance is: "+s);
                        break;
                    }
                    
                    }
                }
                break;
                }
}}          
