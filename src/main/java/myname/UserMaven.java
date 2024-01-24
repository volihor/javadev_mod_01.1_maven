package myname;

public class UserMaven {
    private String name;
    private String lastName;

    public UserMaven(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "{\"name\": \"" + name +
                "\", \"lastName\": \"" + lastName +
                "\"}";
    }
}
