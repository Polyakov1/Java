package AnotherClass;
import java.lang.String;


public abstract class Human {
    private String surnameFirstNamePatronymic;
    private int age;
    private String phone;
    private String gender;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSurnameFirstNamePatronymic(String surnameFirstNamePatronymic) {
        this.surnameFirstNamePatronymic = surnameFirstNamePatronymic;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getSurnameFirstNamePatronymic() {
        return surnameFirstNamePatronymic;
    }

    public Human(String surnameFirstNamePatronymic, int age, String phone, String gender) {
        this.surnameFirstNamePatronymic = surnameFirstNamePatronymic;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
    }
}