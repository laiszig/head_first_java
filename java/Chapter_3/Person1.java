package Chapter_3;

import java.util.ArrayList;
import java.util.List;

public class Person1 {

    // internal state
    private String name;
    private String surname;
    private List<String> address;
    private Integer birthYear;

    private List<String> phones;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setFullname(String fullname) {
        var segments = fullname.split(" ");
        this.name = segments[0];
        this.surname = segments[1];
    }

    public List<String> getAddress() {
        return new ArrayList<>(address);
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}
