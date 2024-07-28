import java.io.*;
import java.util.*;
public class BankingSystem {
    String acno,name,fname,mname,phno;
    int ob;
    char choice;
    public void input()throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        do {
        System.out.println("Enter A/c Number");
        acno=br.readLine();
        System.out.println("Enter Your Name");
        name=br.readLine();
        System.out.println("Enter Father's Name");
        fname=br.readLine();
        System.out.println("Enter Mother's Name");
        mname=br.readLine();
        System.out.println("Enter Phone Number");
        phno=br.readLine();
        System.out.println("Enter Your Opening Balance");
        ob=Integer.parseInt(br.readLine());
        write();
        System.out.println("Do You Wand To Open Another Account Press Y for Yes And N for No");
        choice=(char)br.read();
    }
        while (choice=='y'||choice=='Y');
        br.reset();
    }


    public void write() throws IOException{
        FileOutputStream op = new FileOutputStream("CustomerData", true);
        DataOutputStream dop = new DataOutputStream(op);

            dop.writeChars("Customer Name:" + name + "\n\n");
            dop.writeChars("Father's Name:" + fname + "\n\n");
            dop.writeChars("Mother's Name:" + mname + "\n\n");
            dop.writeChars("Customer's Phone Number:" + phno + "\n\n");

            if (ob >= 5000) {
                System.out.println("Your Account Opened Successfully:");
                FileOutputStream aop = new FileOutputStream(acno);
                DataOutputStream adp = new DataOutputStream(aop);
                adp.writeChars("Account No:" + acno + "\n");
                adp.writeChars("Opening Balance:" + ob + "\n");
            } else {
                System.out.println("Please Enter the Minimum Account Opening Balance");
            }
            op.close();
    }
    public static void main(String args[]) throws IOException {
        BankingSystem bf = new BankingSystem();
        bf.input();
    }
}