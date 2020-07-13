package A2;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.doWoof();
        dog.setName("Tobby");
        dog.setAge(4);
        dog.setRace("Chow Chow");
        dog.setWeight(30);
        System.out.println("Dog name: " + dog.getName());
        System.out.println("Age of dog: " + dog.getAge() + " years");
        System.out.println("Race of dog: " + dog.getRace());
        System.out.println("Weight of dog: " + dog.getWeight() + "kg");
    }
}
