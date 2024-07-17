public class Person {

    private String jumin;
    private String passport;

    public Person(){

    }


    public Person(String jumin){
        this.jumin = jumin;
    }

    public Person(String jumin, String passport){
        this.jumin = jumin;
        this.passport = passport;
    }

    public void show(){
        System.out.println("jumin= "+jumin);
        System.out.println("passport= "+passport);
    }

}
