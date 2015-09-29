package Classes;

/**
 * Created by Elana on 2015/09/29.
 */
public class Employee
{
    public int id;
    public String Name;
    public String Surname;
    public String DOB;
    public String Email;
    public String Address;

    public Employee()
    {

    }

    public int getId() {
        return id;
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

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Employee(int ID, String name, String surname, String dob, String email, String address)
    {
        this.id = ID;
        this.Name =  name;

        this.Surname = surname;
        this.DOB = dob;
        this.Email = email;
        this.Address = address;
    }
}
