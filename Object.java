class student{
    int roll_no;
    String name;
    String college;
    student(){
        roll_no=173;
        name="Sharvari Pradip Talokar";
        college="P.R.Pote Patil College of Engineering and Management";
    }
    student(int r , String n , String c){
        roll_no=r;
        name=n;
        college=c;
    }
    void display(){
        System.out.println("Roll No.:"+roll_no);
        System.out.println("Name:"+name);
        System.out.println("College:"+college);
    }
}
public class Object{
    public static void main(String [] args){
        student s1=new student();
        student s2=new student(163,"Lekha Rahul Dhande","P.R.Pote Patil College Engineering and Mangement");
        s1.display();
        s2.display();
    }
}