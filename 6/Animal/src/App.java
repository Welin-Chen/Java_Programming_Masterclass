public class App {
    public static void main(String[] args) throws Exception {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yoki", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        // dog.walk();
        // dog.run();

        Fish fish = new Fish("AAA", 2, 10, 100, 2, 3);
        fish.swim(10);
    }
}
