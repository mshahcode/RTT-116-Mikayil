package homework.M303_11;


import java.util.ArrayList;

class Book {
    private  int number;
    private  String name;
    private String author;
    private  String category;
    // Constructor with arguments
    public Book(int number, String name, String author, String category)
    {
        this.name = name;
        this.category = category;
        this.author = author;
        this.number = number;
    }
    // Constructor without arguments
    public Book()
    {

    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name1) {
        this.name = name1;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}

class AddDataToArrayList {
    public  ArrayList<Book> bookdetails() {
        //User-defined class objects in Java ArrayList

        ArrayList<Book> list = new ArrayList<Book>();
        // Passing data using Constructors
        Book b1 = new  Book(1, "Death note", "John", "cartoon");
        Book b2 = new Book(2, "Stranger Things", "brothers", "suspense");
        Book b3 = new Book(3, "Spider man", "Alex", "Kids");
        Book b4 = new Book(4, "GentleMen", "Max", "Action");
        // Passing data using setter
        Book b5 = new Book();
        b5.setNumber(5);
        b5.setName("Java FullStack");
        b5.setAuthor("Flex");
        b5.setCategory("Programming");
        // Adding Books objects to Arraylist
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        return list;
    }
}


public class GLAB_303_11_3 {
}
