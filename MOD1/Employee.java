

public class Employee {
    int id;
    String name;
    static String companyName;

    Employee(int id, String name) {
        this.id=id;
        this.name=name;
    }

    static void changeCompanyName(String newCompName){
        companyName = newCompName;
    }

    void display(){
        System.out.println("Employee ID: "+ id+"\nName\t: "+name+ "\nCompany\t: "+ companyName);
    }
public static void main (String[] args){
    Employee.changeCompanyName("Oracle");

    Employee emp1 = new Employee(1, "zaid");
    Employee emp2 = new Employee(2, "khalid");

    emp1.display();
    emp2.display();
}
}
//Employee ID: 1
Name    : zaid
Company : Oracle
Employee ID: 2
Name    : khalid
Company : Oracle
PS C:\Users\zaida\Desktop\java> 
