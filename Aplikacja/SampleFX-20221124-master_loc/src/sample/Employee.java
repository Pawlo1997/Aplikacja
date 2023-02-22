package sample;

public class Employee {
    private String name;
    private String surname;
    //surname alt insert ghetter/setter to string

    private String number_phone;

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

    public String getNumber_phone() {
        return number_phone;
    }

    public void setnumber_phone(String number_phone) {
        this.number_phone = number_phone;
    }
}
