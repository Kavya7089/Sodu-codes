/*
 * Pseudocode:-
 * DECLARE U.ID : STRING
 * DECLARE PASS : STRING
 * READ U.ID
 * READ PASS
 * IF U.ID=="TIT" THEN
 * IF PASS =="TIT" THEN
 * PRINT "WELCOME"
 * ELSE 
 * PRINT "INVALID PASSWORD"
 * END IF
 * ELSE 
 * PRINT "INVALID U.ID"
 * END IF
 */

import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userID, password;      
        System.out.print("Enter User ID: ");
        userID = input.next();
        if (userID.equals("TIT")) {           
            System.out.print("Enter Password: ");
            password = input.next();
            if (password.equals("TIT")) {
                System.out.println("WELCOME");
            } else {
                System.out.println("INVALID PASSWORD");
            }     
        } else {
            System.out.println("INVALID USER ID");
        }  
        input.close();
    }
}
