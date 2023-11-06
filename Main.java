public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.model = "A3";
        audi.speed = 10;
        audi.increaseSpeed(90);
        // System.out.println(audi.speed);
        audi.printSpeed();

        Car bmw = new Car();
        bmw.model = "M3";
        bmw.speed = 20;
        bmw.decreaseSpeed(15);
        bmw.increaseSpeed(180);
        bmw.printSpeed();

        Car mercedes = new Car();
        mercedes.model = "c180";
        mercedes.speed = 15;
        // System.out.println(bmw.speed);
    }
}
