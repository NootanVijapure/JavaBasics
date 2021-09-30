public abstract class animals {
    int age;
    String name;
    String type;

    public animals(int age, String name, String type) {
        this.age = age;
        this.name = name;
        this.type = type;
    }

    public void eat(){
        System.out.println("eating..");
    }

    public void sleep(){
        System.out.println("sleeping");
    }
    public abstract void move();
}
