package Assignment3;

public class Student {
    int ID;
    String Name;
    int Age;

    public Student(int ID, String name, int age) {
        this.ID = ID;
        Name = name;
        Age = age;
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

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", Name='" + Name + '\'' + ", Age=" + Age + '}';
    }
}
