class habit{
    public void food(){
        System.out.println("Eat every thing");
    }
}

class herbi extends habit{
    public void food(){
        System.out.println("Eat herbs thing");
    }
}

class carni extends habit{
    public void food(){
        System.out.println("Eat nonveg thing");
    }
}

class omni extends habit{

}

public class animal {
    public static void main(String args[]) {
        herbi h = new herbi();
        h.food();
        carni c = new carni();
        c.food();
        omni o = new omni();
        o.food();
    }
}
