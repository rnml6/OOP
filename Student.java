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