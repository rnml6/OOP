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