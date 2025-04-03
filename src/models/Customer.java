package models;

public class Customer {
    private long id;
    private String name;
    private boolean isGender;
    private String phoneNumber;
    private String email;
    private String password;

    public Customer() {
    }

    public Customer(long id, String name, boolean isGender, String phoneNumber, String email, String password) {
        this.id = id;
        this.name = name;
        this.isGender = isGender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return isGender;
    }

    public void setGender(boolean gender) {
        isGender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isGender=" + isGender +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
