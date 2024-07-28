interface carCompany{
    public void Mahindra();
    public void suzuki();
    public void mgHector();
    public void huindai();
    public void honda();
}

class models implements carCompany{
    public void Mahindra(){
        System.out.println("Thar");
        System.out.println("XUV 700");
        System.out.println("XUV 300");
    }

    public void suzuki(){
        System.out.println("Swift");
        System.out.println("Ertiga");
        System.out.println("Ciaze");
        System.out.println("Swift Dzire");
    }

    public void mgHector(){
        System.out.println("MgMini");
        System.out.println("MgMiniEv");
    }

    public void huindai(){
        System.out.println("I10");
        System.out.println("Sentro");
        System.out.println("I20");
    }

    public void honda(){
        System.out.println("Ivtech");
        System.out.println("Honda City");
    }
}
public class interfaceDemo {
    public static void main(String args[]){
        models m = new models();
        m.Mahindra();
        m.suzuki();
        m.mgHector();
        m.huindai();
        m.honda();
    }
}
