import java.util.*;
public class initialVelocity {
    public static void main(String args[]) {
        Scanner op = new Scanner(System.in);
                char v1,dt;
                double a,v,d,t,u = 0.0;
                System.out.print("Enter the value of acceleration: ");
                a = op.nextDouble();
                System.out.print("Do you have the value of final velocity?\nEnter 'y' for yes and 'n' for no: ");
                v1 = op.next().charAt(0);
                switch (v1) {
                case ('y'):
                {
                System.out.print("Enter the value of final velocity: ");
                v = op.nextDouble();
                 System.out.print("Do you have the value of distance or time?\nEnter 'd' for distance and 't' for time: ");
                dt = op.next().charAt(0);

                switch (dt) {
                    case ('d'):
                    {
                        System.out.print("Enter the value of distance: ");
                        d = op.nextDouble();
                        u = Math.sqrt((v*v) - (2* a * d));
                        break; //ending d case
                    }
                    case ('t'):
                    {
                        System.out.print("Enter the value of time: ");
                        t = op.nextDouble();
                        u = v - (a * t);
                        break; //ending t case
                    }
                }
                    break; //ending y case
                }
                case ('n'): 
                {
                    System.out.println("Enter the value of distance and time");
                    System.out.print("Distance: ");
                    d = op.nextDouble();
                    System.out.print("Time: ");
                    t = op.nextDouble();
                    u = (d - (0.5*a*t*t))/t;
                    break; // ending n case
                }
                }
                System.out.println("The initial velocity is: " + u); 
    }
}