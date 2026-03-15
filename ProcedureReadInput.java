/*
 * // Alternative way to call procedure
 * PROCEDURE pn()
 *     DECLARE n : STRING
 *     READ n
 *     PRINT n
 * END PROCEDURE
 * CALL pn()
 */

import java.util.Scanner;

public class ProcedureReadInput {
    public static void pn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String n = scanner.nextLine();
        System.out.println(n);
        // Note: Not closing scanner here to prevent closing System.in if used elsewhere
    }

    public static void main(String[] args) {
        pn();
    }
}
