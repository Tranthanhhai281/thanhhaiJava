package Assignment3;

public class Employee {
    int ID ;
    String Name ;
    Long Salary ;

    public Employee(int ID, String name, Long salary) {
        this.ID = ID;
        Name = name;
        Salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getSalary() {
        return Salary;
    }

    public void setSalary(Long salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "ID=" + ID + ", Name= '" + Name + '\'' + ", Salary=" + Salary + '}';
    }
}
