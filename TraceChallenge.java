/*
 * Pseudocode:-
 * INTEGER p,q,r
 * SET q=13
 * FOR(EACH p FROM 1 TO 4)
 * r=q MOD p
 * p=p+5
 * q=p+r
 * END FOR
 * r=q/5
 * PRINT q,5
 */

public class TraceChallenge {
    public static void main(String[] args) {
        int p, q, r;
        q = 13;
        for (p = 1; p <= 4; p++) {
            r = q % p;     
            p = p + 5;     
            q = p + r;     
        }
        double finalR = (double) q / 5; 
        System.out.println(q + ", " + 5);
    }
}
