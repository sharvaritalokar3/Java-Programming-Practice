class employeedetails{
    String name="Sharvari Talokar";
    int ID=173;
    void displaydetails(){
        System.out.println("Name:"+name);
        System.out.println("ID:"+ID);
    }
}
class manager extends employeedetails{
    String dept="HR";
    int salary=50000;
    void displaymanager(){
        System.out.println("Department:"+dept);
        System.out.println("Salary:"+salary);
    }
}
public class writejavainheritance{
    public static void main(String[]args){
        manager m1=new manager();
        m1.displaydetails();
        m1.displaymanager();
    }
}