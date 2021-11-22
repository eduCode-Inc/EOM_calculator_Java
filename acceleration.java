import java.util.*;
public class acceleration {
    public static void main() {
        Scanner op = new Scanner(System.in);
                double u = 0.0, v = 0.0, a = 0.0, d = 0.0, t = 0.0;
                char v1,dt;
                System.out.print("Enter Initial Velocity: ");
                u = op.nextDouble();

                System.out.print("Do you have the value of final velocity?\nEnter 'y' for yes and 'n' for no: ");
                v1 = op.next().charAt(0);

                switch(v1) {
                    case('y'):
                    {
                        System.out.print("Enter Final Velocity: ");
                        v = op.nextDouble();
                        System.out.print("Do you have the value of distance or time?\nEnter 'd' for distance and 't' for time: ");
                        dt = op.next().charAt(0);
                        switch(dt) {
                            case ('d'):
                            {
                                System.out.print("Enter distance: ");
                                d = op.nextDouble();
                                a = ((v*v) - (u*u)) / (2*d);
                                break; // ending d case
                            }
                            case ('t'):
                            {
                                System.out.print("Enter time: ");
                                t = op.nextDouble();
                                a = (v - u) / t;
                                break; // ending t case
                            }
                        }
                        break; // end of case y
                    }
                    case ('n'):
                    {
                        System.out.println("Enter distance and time:");
                        System.out.print("Distance: ");
                        d = op.nextDouble();
                        System.out.print("Time: ");
                        t = op.nextDouble();
                        a = 2 * (d - (u * t)/(t*t));
                        break; // ending n case;
                    }
                    }
                    System.out.println("Acceleration: " + a);
    }
    public void GaaliDe() {
        System.out.println("Wrong character dala hai. Khopdi phod saale ka!");
    }
}