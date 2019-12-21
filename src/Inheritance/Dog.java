package Inheritance;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;

    public Dog(String name,int size, int weight, int eyes, int legs, int tail) {
        super(name, 1,1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
    }

    private void chew(){
        System.out.println("Chew");
    }

    @Override
    public void eat() {
        super.eat();
        chew();
    }

    public void walk(){
        System.out.println("Walk");
        move();
    }

    public void run(){
        System.out.println("Run");
        move();
    }


}
