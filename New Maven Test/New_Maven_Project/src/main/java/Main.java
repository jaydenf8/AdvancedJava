public class Main {
    public static void main(String[] args) {
        System.out.println("WTF");

        Animal nicky = new Animal("Nicky");

        nicky.speak();


    }


}

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(this.name + " SPEAKS!");
    }
}



