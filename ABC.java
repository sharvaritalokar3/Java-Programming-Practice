 class student{
    private int roll_no;
    private String name;
    public String college;
    public void setRollNo(int r){
        roll_no=r;
    }
    public void setName(String n){
        name=n;
    }
    public void setCollege(String c){
        college=c;
    }
    public int getRollNo(){
        return roll_no;
    }
    public String getName(){
        return name;
    }
    public String getCollege(){
        return college;
    }
}
public class ABC{
    public static void main(String [] args){
        student s1=new student();
        s1.setRollNo(173);
        s1.setName("Sharvari Pradip Talokar");
        s1.setCollege("PRPCEM");
        System.out.println("Roll No.:"+s1.getRollNo());
        System.out.println("Name:"+s1.getName());
        System.out.println("College:"+s1.getCollege());
    }
}