import java.math.*;

public class Main {
    public static void main(String[] args) {
    System.out.println(vychisl(1,50,3,1));
    System.out.print(vychisl(2,128,2,2));
    }
    public static double vychisl(int nachalo, int konech, int stepen, int shag) {
        double res = 0;
        for (int i = nachalo; i <= konech; i += shag){
            res += 1/(Math.pow(i,stepen));

        }
        return res;

    }
}
