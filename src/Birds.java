public class Birds extends animals implements Flyable{
    public Birds(int age, String name, String type) {
        super(age, name, type);
    }

    @Override
    public void move() {
        System.out.println("bird flying");
    }

    public static void main(String[] args) {
        Birds bird= new Birds(1, "pintu","mammal");
        bird.fly();
        bird.eat();
        bird.sleep();
    }

    @Override
    public void fly() {
        System.out.println("flying");

    }
}
