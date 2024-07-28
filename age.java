import java.util.Scanner;

public class age {
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age :");
        int age = sc.nextInt();
        log(age);
    }

    public void log(int age){
        if (age>18)
            System.out.println("Adult");
        else
            System.out.println("Not Adult");
    }

    public static void main(String args[]){
        age ag = new age();
        ag.input();
    }
}
