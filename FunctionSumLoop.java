/*
 * // Sum the series 1 ... n
 * FUNCTION Sum (n : INTEGER) : INTEGER
 *   DECLARE s : INTEGER
 *   SET s := 0
 *   FOR i := 1 to n
 *     s := s + i
 *   END FOR
 *   RETURN s
 * END FUNCTION
 * PRINT Sum(5)
 */

public class FunctionSumLoop {
    public static int sum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
