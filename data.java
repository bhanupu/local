class student {
    String name;
    int id, age;
    String college_name;

    public void print(){
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.age);
        System.out.println(this.college_name);
    }

    student(student s2){
        this.name = name;
        this.id = id;
        this.age = age;
        this.college_name = college_name;
    }

    student(){

    }
}


public class data {
    public static void main(String args[]){
        student st = new student();
        st.name = "bhanu";
        st.id = 1;
        st.age = 18;
        st.college_name = "DDUMC";

    }

}