import java.util.Scanner;

public class Info {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your marks: ");
        double marks = scanner.nextDouble();

        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("Marks: " + marks);

        scanner.close();
    }
}

Output:
Enter your name: zaid
Enter your age: 20
Enter your marks: 9.18
Name : zaid
Age  : 20
Marks: 9.18
PS C:\Users\zaida\Desktop\java> 
