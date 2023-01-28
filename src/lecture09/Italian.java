package lecture09;

public class Italian extends Person {
    public Italian(String name, String sex, String religion, String language, String job, String nationality, long egn, String country) {
        super(name, sex, religion, "Italian", job, "Italian", egn, "Italy");
    }

    @Override
    public void sayHello() {
        System.out.println("Ciao!");
    }

    @Override
    public void celebrateEaster(String religion) {
        super.celebrateEaster(religion);
    }

    @Override
    public boolean isAdult() {
        return super.isAdult();
    }

    @Override
    public boolean canTakeLoan() {
        return super.canTakeLoan();
    }

    public void isEatingPizza(){
        System.out.println("Italians eat pizza every day");
    }
}
