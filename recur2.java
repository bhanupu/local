public class recur2 {
    public static int input(int n){
        if (n==1||n==0){
            return 1;
        }
        int fac = input(n-1);
        int sum = n*fac;
        return sum;
    }

    public static void main(String[] args) {
        int n=5;
        int sum = input(n);
        System.out.println(sum);
    }
}
