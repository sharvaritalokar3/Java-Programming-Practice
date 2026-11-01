class Animal{
    void eat(){
        System.out.println("Animal is Eating!");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking!");
    }
}
class cat extends Animal{
    void meow(){
        System.out.println("Cat is meowing");
    }
}
class lion extends Animal{
    void roar(){
        System.out.println("Lion is Roaring!");
    }
}
public class hierachical{
    public static void main(String [] args){
        dog d=new dog();
        cat c=new cat();
        lion l=new lion();
        d.eat();
        d.bark();
        c.eat();
        c.meow();
        l.eat();
        l.roar();
    }
}