/**
 * 100 closed lockers
 *
 * 1 + 3 = 4 (2*2)
 * 4 + 5 = 9 (3*3)
 * 9 + 7 = 16 (4*4)
 * 16 + 9 = 25 (5*5)
 * 25 + 11 = 36 (6*6)
 * 36 + 13 = 49 (7*7)
 * 49 + 15 = 64 (8*8)
 * 64 + 17 = 81 (9*9)
 * 81 + 19 = 100 (10*10)
 *
 * declare the 2D array
 * for loop int i = 1; i < 11; i++
 * another for loop int j = 1; j < 11; j++
 * if i is equal to j
 * multiply them
 * set boolean to true
 * set string to open
 * print out statement
 *
 * else
 *
 * still take the sum
 * set each other array to false
 * set each other array to closed
 */




public class ProblemArray {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        boolean tOrF = false;
        int sum = 0;
        String openOrClosed = "";
        for (int i = 1; i < 11; i++){
            for (int j = 1; j < 11; j++){
                if (i == j){
                    sum = i*j;
                    tOrF = true;
                    openOrClosed = "Open";
                    System.out.println("These following lockers are open: " + sum + " is " + openOrClosed);
                } else {
                    sum = i*j;
                    tOrF = false;
                    openOrClosed = "Closed";
                }
            }
        }
    }
}
