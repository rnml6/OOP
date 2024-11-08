public class EncapsulationSample{

    public static void main(String[] args){

        System.out.println("Hello World!");
        System.out.println("");
        Student student1 = new Student();
        student1.setId(1234);
        student1.setname("Student_1");

        System.out.println("Student Id: " + student1.getId());
        System.out.println("Student Name: " + student1.getname());
        System.out.println("");

        Book book1 = new Book();
        book1.setNumber(1);
        book1.set_Title("Holy Bible");
        book1.setPrice(500);

        System.out.println("Book Number: " + book1.getNumber());
        System.out.println("Book Title: " + book1.getTitle());
        System.out.printf("Book Price: %.2f php", book1.getPrice());
    }
}

class Student{
    private int Student_Id;
    private String name;

    public void setId(int s_id){
        this.Student_Id = s_id;
    }

    public void setname(String s_name){
        this.name = s_name;
    }

    public int getId(){
        return Student_Id;
    }

    public String getname(){
        return name;
    }
}

class Book {
    int Book_Number;
    String Title, Author;
    float Price;

    public void setNumber(int Book_Number){
        this.Book_Number = Book_Number; 
    }
    public void set_Title(String Title){
        this.Title = Title;
    }
    public void setAuthor(String Author){
        this.Author = Author;
    }
    public void setPrice(float Price){
        this.Price = Price;
    }

    public int getNumber(){
        return Book_Number;
    }
    public String getTitle(){
        return Title;
    }
    public String getAuthor(){
        return Author;
    }
    public float getPrice(){
        return Price;
    }
}