class Animal{
    void eat(){
        System.out.println("Animal is Eating!!");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking!!");
    }
}
public class single{
    public static void main(String [] args){
        dog d1=new dog();
        d1.eat();
        d1.bark();
    }
}