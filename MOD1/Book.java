public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Title   :" + title);
        System.out.println("Author  :" + author);
    }

    public static void main(String[] args) {
        Book myBook = new Book("1984", "George Orwell");

        myBook.display();
    }
}

Output:
Title   :1984
Author  :George Orwell
PS C:\Users\zaida\Desktop\java> 
