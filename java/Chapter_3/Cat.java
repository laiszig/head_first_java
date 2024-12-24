package Chapter_3;

public class Cat {

    int height;
    int weight;

}

class TestMain {
    public static void main(String[] args) {

        Cat c = new Cat();
        Cat c2 = new Cat();

        c.height = 10;
        c.weight = 20;
        System.out.println(c.height);
        System.out.println(c.weight);

        Cat c3 = new Cat();

        System.out.println(c2.height);
        System.out.println(c2.weight);

        System.out.println(c3.height);
        System.out.println(c3.weight);
    }
}