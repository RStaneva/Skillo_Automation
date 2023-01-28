package lecture09;

public class Bulgarian extends Person {
    public Bulgarian(String name, String sex, String religion, String language, String job, String nationality, long egn, String country) {
        super(name, sex, religion, "Bulgarian", job, "Bulgarian", egn, "Bulgaria");
    }

    @Override
    public void sayHello() {
        System.out.println("Zrasti");
    }

    public void prepareRakia() {
        System.out.println("Makes very strong alcohol drinks");;
    }
}
