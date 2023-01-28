package lecture08.Employee;

public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private double monthlySalary;

 public Employee(String id, String firstName, String lastName, double monthlySalary){
     this.id=id;
     this.firstName=firstName;
     this.lastName=lastName;
     this.monthlySalary=monthlySalary;
 }

    public String getName(){
        return firstName+ " "+lastName;
    };
    public double getAnnualSalary(){
        return 12*monthlySalary;
    };
    public double getUpdatedSalary(double percentage){
         monthlySalary=monthlySalary+monthlySalary*percentage/100;
        return monthlySalary;
    }
    @Override
    public String toString(){
        return "Employee{"+ "id= "+ id +", firstName= "+firstName+ ", lastName= "+lastName+ ", salary= "+monthlySalary+'}';
    }

}
