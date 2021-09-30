public class Fish extends animals {
    public Fish(int age, String name, String type) {
        super(age, name, type);
    }

    @Override
    public void move() {
        System.out.println("fish moving");
    }

    public static void main(String[] args) {
Fish fish= new Fish(2, "goldie","");
        fish.eat();
        fish.sleep();
        fish.swim();
    }
    public void swim(){
        System.out.println("swimming..");
    }

}
