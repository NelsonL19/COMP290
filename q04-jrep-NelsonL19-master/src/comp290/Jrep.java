

// Author: Nelson Lopez 
// PID: 730157511 
// /I pledge the UNC and COMP290 Honor Code.
//
//

package comp290;

import java.util.Scanner;

public class Jrep {

    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);

        if (args.length != 1) {
            System.out.println("Usage: jrep [PATTERN]");
            s.close();
            System.exit(1);
        }

        if (args[0].equals("--help")) {
            System.out.println("Usage: jrep [PATTERN]");
            s.close();
            System.exit(1);
        }


        while (s.hasNext()) {
            String next = s.nextLine();

            if (next.contains(args[0])) {
                System.out.println(next);
            }

    } 
            s.close();
} 
} 


