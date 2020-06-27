
import java.util.*;
    public class DataTypes {

        public static void main(String[] args) {
            int i = 4;
            double d = 4.0;
            String s = "HackerRank ";

            Scanner scan = new Scanner(System.in);

            /* Declare second integer, double, and String variables. */
            int a=scan.nextInt();
            double b=scan.nextDouble();
            String str;
            str=scan.nextLine();

            /* Read and save an integer, double, and String to your variables.*/
            // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
            System.out.println(i+a);
            System.out.println(d+b);
            System.out.println(s+scan.nextLine());
            /* Print the sum of both integer variables on a new line. */

            /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

            scan.close();
        }
    }

