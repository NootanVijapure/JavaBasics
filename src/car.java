public class car {
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight =4079;
    boolean isCarOn =false;
    char condition ='A';
    String nameOfCar="Lucy";


    public void printVariable(){
        System.out.println("This is max speed"+maxSpeed);
        System.out.println("this is min speed"+minSpeed);
        System.out.println("this is car weight"+weight);
        System.out.println("is car on"+isCarOn);
        System.out.println("condition "+condition);
        System.out.println("nameOfCar"+nameOfCar);
    }

    public void wreckCar(){
        condition='C';
    }
    public static void main(String[] args) {
        car familyCar = new car();
        familyCar.printVariable();


        car aliceCar= familyCar;

        familyCar.wreckCar();
        System.out.println("Alice car");

        car familyCar1 = new car();
        familyCar1.printVariable();
        familyCar1.printVariable();



    }
}
