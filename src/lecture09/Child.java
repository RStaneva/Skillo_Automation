package lecture09;

public class Child extends Person {

    private String toy;
    public Child(String name, String sex, String religion, String language, String nationality, long egn, String country, String toy) {
        super(name, sex, religion, language, null, nationality, egn, country);
        this.toy=toy;
    }

    @Override
    public void sayHello() {
        super.sayHello();
    }

    @Override
    public void celebrateEaster(String religion) {
        super.celebrateEaster(religion);
    }

    @Override
    public boolean isAdult() {
        System.out.println("The child is not an adult");
        return false;
    }

    @Override
    public boolean canTakeLoan() {
        System.out.println("The child can not take a loan.");
        return false;
    }

    public void isPlaying(String toy){
      System.out.println("The child is playing with:"+toy);
  }
}



