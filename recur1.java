import java.util.*;

public class recur1 {

    public static void input(int i, int n, int sum){
        if (i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        input(i+1,n,sum);
    }

    public static void main(String[] args) {
        int a=1;
        int b=9;
        int add=0;
        input(a,b,add);
    }
}
