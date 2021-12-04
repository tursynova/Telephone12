public class Person {
    private String name;
    private String surname;
    private long number;
    private String address;


     public Person(){}

    public Person(String name, String surname, long number, String address) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name+" "+surname+" "+number+" "+address;
    }
}
