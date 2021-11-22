import java.util.*;
public class Time {
    public static void main(String args[]){
        Scanner op = new Scanner(System.in);
                char sv;
                double a,u,v,s,t = 0.0;   
                System.out.print("Enter the acceleration: ");
                a = op.nextDouble();
                System.out.print("Enter the inital velocity: ");
                u = op.nextDouble();
                System.out.print("Do you have the value of Distance or Final Velocity?\nEnter 'd' for Distance and 'v' for Final Velocity: ");
                sv = op.next().charAt(0);
                        switch (sv) {
                            case ('d') :
                            {
                                System.out.print("Enter the Distance: ");
                                s = op.nextDouble();
                                v = (Math.sqrt(u*u + 2*a*s));
                                t = (v-u)/a;
                                System.out.println("The time is "+t);
                                break;
                            }
                            case ('v') :
                            {
                                System.out.print("Enter the final velocity: ");
                                v = op.nextDouble();
                                t = (v-u)/a;
                                System.out.println("The time is "+t);
                                break;
                            }
                    }
            }
    }