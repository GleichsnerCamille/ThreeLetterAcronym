
package threeletteracronym;
import static java.lang.Character.*;
import java.util.*;

public class ThreeLetterAcronym {

    public static void main(String[] args) {
       Scanner zoinks = new Scanner(System.in);
       String alpha;
       String beta;
       String gamma;
       String delta;
       char[] tla = new char[3];
       
       String[] Sigma = new String[3];
       
        System.out.println("Please enter a three word title for the TLA: ");
        alpha = zoinks.nextLine();
        Sigma = alpha.split(" ");
        beta = Sigma[0];
        gamma = Sigma[1];
        delta = Sigma[2];
        tla[0] = beta.charAt(0);
        tla[1] = gamma.charAt(0);
        tla[2] = delta.charAt(0);
        for(int x = 0; x < tla.length; ++x) {
            tla[x] = toUpperCase(tla[x]);
        }
        System.out.print("TLA for " + alpha + " is: ");
        
        for(int x = 0; x < tla.length; ++x) {
             System.out.print(tla[x]);
        }
        System.out.println("");
    }
    
}
