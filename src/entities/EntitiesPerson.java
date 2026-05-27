package entities;

public class EntitiesPerson {

    private String id;
    private String name;
    private String lastname;
    private String email;
    private String phonenumber;
    private String address;
    private EntitiesPet pet;

    public EntitiesPerson(String id, String name, String lastname, String email, String phonenumber, String address, EntitiesPet pet) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phonenumber = phonenumber;
        this.address = address;
        this.pet = pet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public EntitiesPet getPet() {
        return pet;
    }

    public void setPet(EntitiesPet pet) {
        this.pet = pet;
    }
}
