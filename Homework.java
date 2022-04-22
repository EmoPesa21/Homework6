import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner formula = new Scanner(System.in);

        System.out.println("Enter value A: ");
        a = formula.nextDouble();

        System.out.println("Enter value B: ");
        b = formula.nextDouble();

        System.out.println("Enter value C: ");
        c = formula.nextDouble();

        double D = Math.pow(b,2) - (4*a*c);
        System.out.println(D);
        double x1 = (2*a)/(-b + Math.sqrt(D));
        double x2 = (2*a)/(-b - Math.sqrt(D));

        boolean TwoSolutions = D >= 0;
        boolean NoSolution = D < 0;

        if (TwoSolutions) {
            System.out.println("Solutions: " + x1 + " and " + x2);
        } else if(NoSolution){
            System.out.println("No solution!!!");
        } else  {
            System.out.println("Insane!");
        }


    }

}
