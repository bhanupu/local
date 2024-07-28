import java.util.Scanner;

class logic{
    int sum, sub, pro, div;
    public int addition(int a, int b){
    sum = a+b;
    return sum;
    }

    public int subtraction(int a, int b){
        sub = a-b;
        return sub;
    }

    public int multiplication(int a, int b){
        pro = a*b;
        return pro;
    }

    public int division(int a, int b){
        div = a/b;
        return div;
    }
}

class select extends logic{
    char choice;
    int num1, num2;
    public void info(){
        System.out.println("Press + for Addition");
        System.out.println("Press - for Subtraction");
        System.out.println("Press * for Multiplication");
        System.out.println("Press / for Division");
        Scanner sc = new Scanner(System.in);
        choice = sc.next().charAt(0);
    }

    public void print(){
        switch (choice){
            case '+':
                System.out.println("Enter two numbers");
                Scanner sco = new Scanner(System.in);
                num1 = sco.nextInt();
                num2 = sco.nextInt();
                System.out.println(addition(num1,num2));
                break;
            case '-':
                System.out.println("Enter two numbers");
                Scanner scm = new Scanner(System.in);
                num1 = scm.nextInt();
                num2 = scm.nextInt();
                System.out.println(subtraction(num1,num2));
                break;
            case '*':
                System.out.println("Enter two numbers");
                Scanner scp = new Scanner(System.in);
                num1 = scp.nextInt();
                num2 = scp.nextInt();
                System.out.println(multiplication(num1,num2));
                break;
            case '/':
                System.out.println("Enter two numbers");
                Scanner scd = new Scanner(System.in);
                num1 = scd.nextInt();
                num2 = scd.nextInt();
                System.out.println(division(num1,num2));
                break;
        }
    }
}


public class calculator {
    public static void main(String args[]){
        select sl = new select();
       sl.info();
       sl.print();
    }
}