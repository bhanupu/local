class funOne{
    public void methodOne(){
        System.out.println("I am methodOne of parent");
    }
    public void methodTwo(){
        System.out.println("I am methodTwo of parent");
    }
}

class funTwo extends funOne{
    public void methodOne(){
        System.out.println("I am methodOne of child");
    }
    public void methodThree(){
        System.out.println("I am methodThree of child");
    }
}


public class overloading {
    public static void main(String args[]){
        funTwo ft = new funTwo();
        ft.methodOne();
        ft.methodTwo();
        ft.methodThree();

    }
}
