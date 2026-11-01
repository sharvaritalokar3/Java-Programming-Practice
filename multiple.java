class person{
    String name;
    int age;
    void displayperson(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
class employee extends person{
    int employee_id;
    int salary;
    void displayemployee(){
        System.out.println("Employee ID:"+employee_id);
        System.out.println("Salary:"+salary);
    }
}
class manager extends employee{
    String department;
    void displaymanager(){
        System.out.println("Department:"+department);
    }
}
public class multiple{
    public static void main(String [] args){
        person p1=new person();
        p1.name="Sharvari Pradip Talokar";
        p1.age=19;
        p1.displayperson();
        employee e1=new employee();
        e1.employee_id=173;
        e1.salary=23000000;
        e1.displayemployee();
        manager m1=new manager();
        m1.department="HR";
        m1.displaymanager();
    }
}