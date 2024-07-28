import java.util.Scanner;

public class Oops {
    int a, b,sum;
    public void inp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
         a = sc.nextInt();
         b = sc.nextInt();
    }

    public void Sum(){
         sum = a+b;
    }

    public void add(){
        System.out.println("Addition is " +sum);
    }

    Oops(){
        System.out.println("Hello Sir");
    }

    public static void main(String args[]){
        Oops op = new Oops();
        op.inp();
        op.Sum();
        op.add();
    }
}