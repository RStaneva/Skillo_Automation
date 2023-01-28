package lecture09;

public class American extends Person {
    public American(String name, String sex, String religion, String language, String job, String nationality, long egn, String country) {
        super(name, sex, religion, "English", job, "American", egn, "USA");
    }

    @Override
    public void sayHello() {
        super.sayHello();
    }

    @Override
    public boolean isAdult() {
        return super.isAdult();
    }
}
