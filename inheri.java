class studentData{
    int id;
    String name, surname, study;
}

class location extends studentData{
    String city, country;
}

class result extends location{
    String result;
}

public class inheri {
    public static void main(String args[]){
        location l = new location();
        result r = new result();
        l.id = 1;
        l.name = "Bhanu Prakash";
        l.surname = "Upmanyu";
        l.study = "BCA";
        l.city = "Meerut";
        l.country = "India";
        r.result = "toper";
        System.out.println(l.id);
        System.out.println(l.name);
        System.out.println(l.surname);
        System.out.println(l.study);
        System.out.println(l.city);
        System.out.println(l.country);
        System.out.println(r.result);
    }
}
