package AddressBooks;

public class Contact {
    String Name;
    String Company;
    String Email ;
    String PhoneNumber ;

    public Contact(String name, String company, String email, String phoneNumber) {
        Name = name;
        Company = company;
        Email = email;
        PhoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" + "Name='" + Name + '\'' + ", Comany='" + Company + '\'' +
                ", Email='" + Email + '\'' + ", PhoneNumber='" + PhoneNumber + '\'' + '}';
    }
}
