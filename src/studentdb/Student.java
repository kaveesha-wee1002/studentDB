package studentdb;

public class Student {
    private int id;
    private String name;
    private int age;
    private String email;

    public Student(int id, String name, int age, String email) {
        this.id = id; this.name = name; this.age = age; this.email = email;
    }

    public Student(String name, int age, String email) {
        this(0, name, age, email);
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + age + " | " + email;
    }
}