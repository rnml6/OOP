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