class teacher {
    String name;
    String subject;
    void displayteacher() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
    }
}
class AssistantProfessor extends teacher {
    String department;
    double salary;
    void displayAssistantProfessor() {
        displayteacher(); 
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}
public class main{        
    public static void main(String[] args) {
        AssistantProfessor ap = new AssistantProfessor();
        ap.name = "Sharvari Talokar";
        ap.subject = "OOP";
        ap.department = "AI & DS";
        ap.salary = 250000;
        ap.displayAssistantProfessor();
    }
}