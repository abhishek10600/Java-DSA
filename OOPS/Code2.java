class Student {
    String name;
    int age;

    public void printStudentInfo() {
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Student(Student obj) {
        this.name = obj.name;
        this.age = obj.age;
    }
}

public class Code2 {
    public static void main(String args[]) {
        Student s1 = new Student("Abhishek Sharma", 23);
        s1.printStudentInfo();

        // Passing Student object s1 in copy constructor.
        Student s2 = new Student(s1);
        s2.printStudentInfo();
    }
}
