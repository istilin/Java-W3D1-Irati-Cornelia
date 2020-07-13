package irati.A6;

public class Main {
    public static void main(String[] args) {
        Product deo = new Product();
        deo.setName("Deodorant");
        deo.setDescription("Get a fresh touch.");
        deo.setPrice(3);
        System.out.println(deo.toString());

        Book history = new Book();
        history.setName("History Book");
        history.setDescription("This is a History book.");
        history.setPrice(20);
        System.out.println(history.toString());

        PhysicalBook math = new PhysicalBook();
        math.setName("Math Book");
        math.setDescription("This is a Mathematics book.");
        math.setPrice(50);
        math.setWeight(500);
        System.out.println(math.toString());

        ElectronicBook physics = new ElectronicBook();
        physics.setName("Physics Book");
        physics.setDescription("This is a Physics book.");
        physics.setPrice(40);
        physics.setURL("www.somethingsomething.com");
        System.out.println(physics.toString());

        Pet pig = new Pet();
        pig.setName("Pig");
        pig.setDescription("This is a beautiful pig.");
        pig.setPrice(100);
        System.out.println(pig.toString());

        Dog dog = new Dog();
        dog.setName("Tobby");
        dog.setDescription("This is a cute dog.");
        dog.setPrice(150);
        dog.setSound("Woof");
        System.out.println(dog.toString());

        Cat cat = new Cat();
        cat.setName("Meow Zedong");
        cat.setDescription("This is an ignoring cat.");
        cat.setPrice(1000);
        cat.setIgnores("Throwing your glass of milk to the floor.");
        System.out.println(cat.toString());



    }
}
