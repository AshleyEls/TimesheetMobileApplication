package Classes;

/**
 * Created by Elana on 2015/09/29.
 */
public class Contact {

    public int id;
    public String Name;
    public String Phone;
    public String Email;

    public Contact() {
    }

    public Contact(int ID, String name, String phone, String email)
    {
        this.id = ID;
        this.Name = name;
        this.Phone = phone;
        this.Email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getId() {

        return id;
    }
}
