package lecture09;

import java.time.LocalDate;

public class Person {

    /*
   Create class Person which has the following attributes: name, sex, religion, language spoken, job, nationality,
EGN, date of birth, age, country of residence.
The date of birth attribute and age are composed during the creation of an object based on the EGN.
EGN consists of 10 digits. If provided value for EGN or sex are not correct throw exception.
If wrong sex is provided program must continue its normal execution with printing relevant message.
Only job and country of residence could change their values. All other attributes can`t be changes once they are
set.
The Person class should have methods – sayHello(), celebrateEaster(), isAdult(), canTakeLoan() with the relevant
parameters if any.
sayHello() should print Hello based on concrete person spoken language, default is in English.
celebrateEaster should print if the concrete person celebrates Easter based on their religion.
isAdult should take in consideration the country of residence.
canTakeLoan is based on the job.
Languages – Bulgarian / Italian / English; Countries – Bulgaria (18) / Italy (18) / USA (21); Sex – Male /
Female
Religions – Orthodox / Catholic / Islam
Create 4 classes Child, Bulgarian, American and
Italian which inherit Person class
Use polymorphism to change the implementation of
the methods that need different behavior.
Implement new methods specific only for the
concrete class.
Create different objects in the main class and use
their methods.
     */
    private final String name;
    private String sex;
    private final String religion;
    private final String language;
    private String job;
    private final String nationality;
    private String country;
    private String dateOfBirth;
    private int age;
    private long egn;

    public Person(String name, String sex, String religion, String language, String job, String nationality, long egn, String country) {
        //параметрите age& dateBirth не присъстват, защото за тях не следва да се подава стойност, а трбва да бъдат генерирани посредством егн-то
        this.name = name;
        this.religion = religion;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.country = country;
        //внимаваме са поредността на сетърите, защото са свързани, първо е валидацията на егн-то, после останалите
        setEgn(egn);
        setDateOfBirth(egn);
        setAge(egn);
        setSex(sex);
        //ползваме setters и ги извикваме в конструктора, за да може да се генерират всеки път при създаване на обект, иначе понеже са private
        //не би могло да се извикат.
    }

    private void setDateOfBirth(long egn) {
        String date = Long.toString(egn).substring(4, 6);
        String month = Long.toString(egn).substring(2, 4);
        this.dateOfBirth = date + month;
    }

    private void setAge(long egn) {
        String year = Long.toString(egn).substring(0, 2);
        if (Integer.parseInt(year) <= 23) {
            year = 2000 + year;
        }
        year = 1900 + year;
        int currentYear = LocalDate.now().getYear();
        this.age = currentYear - Integer.parseInt(year);
    }

    private void setEgn(long egn) {
            if (String.valueOf(egn).length() == 10) {
                this.egn=egn;
            }else{
        throw new RuntimeException ("Invalid format. The egn must have 10 digits exactly");
        }
    }

    private void setSex(String sex){
        try {
            validateSex(sex);
            this.sex = sex;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void validateSex(String sex)throws Exception {
        if (!sex.equalsIgnoreCase("male") && !sex.equalsIgnoreCase("female")) {
            throw new Exception("Please provide a valid value for sex. Valid options are 'male' or 'female'");
        }
    }


//създаваме public методите, които са характерни за класа, за да може да се извикват от класовете наследници

    public void sayHello(){
        System.out.println("Hello");
    }

    public void celebrateEaster(String religion){

        if (religion.equalsIgnoreCase("Catholic")|| religion.equalsIgnoreCase("Ortodox")){
            System.out.println("He celebrates Easter");
        }else {
            System.out.println("He doesn't celebrate Easter");
        }
    }

    public boolean isAdult(){
        switch (country){
            case "Bulgaria":
            case "Italy":
        return age>=18;
            case "USA":
                return age>=21;
            default:
                throw new RuntimeException("We don't have information about country:"+ country);
        }
    }

    public boolean canTakeLoan(){
        return job!=null;
    }

    }
