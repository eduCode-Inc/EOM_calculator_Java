import java.util.*;

public class main {
    public static void main(String args[]) {
        Scanner gh = new Scanner(System.in);
        char chzzzz;
        System.out.println("Welcome to EoM Calculator!\nUsing this, you can calculate any value in the equations of motion!");
        System.out.println("\tEnter 'a' for acceleration\n\tEnter 'u' for initial velocity\n\tEnter 'v' for final velocity\n\tEnter 't' for time\n\tEnter 'd' for distance");
        System.out.print("Enter which value would you like to calculate: ");
        chzzzz = gh.next().charAt(0);

        switch(chzzzz) {
            case ('a'):
            {
                acceleration prog = new acceleration();
                prog.main(); //to run properly
                break;
            }
            case ('u'):
            {
                initialVelocity program = new initialVelocity();
                program.main(null);
                break;
            }
            case ('v'):
            {
                Final_Velocity prog = new Final_Velocity();
                prog.main(null);
                break;
            }
            case ('t'):
            {
                Time prog = new Time();
                prog.main(null);
                break;
            }
            case ('d'):
            {
                Distance prog = new Distance();
                prog.main(null);
                break;
            }
            default:
            {
                acceleration p = new acceleration();
                p.GaaliDe();
                break;
            }
        }
    }
}