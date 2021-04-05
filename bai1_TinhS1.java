/*
bai1_TinhS1 = 1 + 1/2 + 1/3 + 1/4 +...+ 1/n
*/

public class bai1_TinhS1 {
    public static void main(String[] args) {
        int n = 10;
        double S = 0;
        for (int i = 1; i <= n; i++)
        {
            S += 1.0/i;
        }
        System.out.println(S);
    }  
}