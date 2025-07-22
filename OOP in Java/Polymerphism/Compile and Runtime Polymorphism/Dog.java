class Animal {
    public static void speak() {
        System.out.println("Animal says: Hello");
    }
}

class Dog extends Animal {
    public static void speak() {
        System.out.println("Dog says: Woof");
    }

    public static void main(String[] args) {
		System.out.println("Compile and Runtime Polymerphism");
		System.out.println("---------------------------------");
        Animal a = new Dog();
		
        a.speak();
        Dog.speak();

        System.out.println("End of program");
    }
}

