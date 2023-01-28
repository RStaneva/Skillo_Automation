package lecture08.Employee;

public class main {
    public static void main(String []args){
        Employee employee=new Employee("8312207472","Rumen","Petkov",2000.00);
            String name=employee.getName();
            double annualSalary=employee.getAnnualSalary();
            double updatedSalary= employee.getUpdatedSalary(50);
        System.out.println(employee);



    }
}
