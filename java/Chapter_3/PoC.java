package Chapter_3;

import java.util.ArrayList;
import java.util.List;

public class PoC {


    public static void main(String[] args) {

        Person person = new Person();
        person.name = "Marcelo";
        person.surname = "Serpa";
        person.address = List.of("A", "B", "C");
        person.birthYear = 1990;

        var person1 = new Person1();
        person1.setFullname("Marcelo Serpa");

        List<String> address = new ArrayList<>();
        address.add("A");
        address.add("B");
        address.add("C");

        person1.setAddress(address);

        List<String> address2 = person1.getAddress();

        // side effect
        address2.add("OIIIIIIIIIIIIIIIIIIIIIIIII");

        System.out.println(person1.getAddress());
    }

}
