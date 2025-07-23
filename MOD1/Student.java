public class Student {
    String name;
    int rollNo;

    public Student(String studentName, int studentRollNo) {
        name = studentName;
        rollNo = studentRollNo;
    }

    public void display() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
    }

    public static void main(String[] args) {
        Student student1 = new Student("zaid", 3);
        Student student2 = new Student("arhan", 12);

        System.out.println("Student 1 Details:");
        student1.display();

        System.out.println("\nStudent 2 Details:");
        student2.display();
    }
}

Output:
Student 1 Details:
Name    : zaid
Roll No : 3

Student 2 Details:
Name    : arhan
Roll No : 12
PS C:\Users\zaida\Desktop\java> 
