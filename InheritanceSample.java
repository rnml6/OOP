public class InheritanceSample {
    public static void main(String[] args){
        Student student1 = new Student("Juan", "Batangas PH","BSIT", 2);
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Address: " + student1.getAddress());
        System.out.println("Student Program: " + student1.getProgram());
        System.out.println("Student Year: " + student1.getYear());

        System.out.println("");

        Staff staff1 = new Staff("Tombeng", "San Piro", "BSU" , 5300.95);
        System.out.println("Staff Name: " + staff1.getName());
        System.out.println("Staff Address: " + staff1.getAddress());
        System.out.println("Staff School: " + staff1.getSchool());
        System.out.println("Staff Salary: " + staff1.getSalary() + " php");
    }
}

    class Person{
        protected String Name;
        protected String Address;

        public void setName(String Name){
            this.Name = Name;
        }
        public void setAddress(String Address){
            this.Address = Address;
        }
        public String getName(){
            return Name;
        }
        public String getAddress(){
            return Address;
        }
    }

class Student extends Person{
        private String Program;
        private int Year;

        public Student(String Name, String Address, String Program, int Year){
            this.Name = Name;
            this.Address = Address;
            this.Program = Program;
            this.Year = Year;
        }
        public void setProgram(String Program){
            this.Program = Program;
        }
        public void setYear(int Year){
            this.Year = Year;
        }
        public String getProgram(){
            return Program;
        }
        public int getYear(){
            return Year;
        }
    }

class Staff extends Person{
    private String School;
    private double Salary;

    public Staff(String Name, String Address, String School, double Salary){
        this.Name = Name;
        this.Address = Address;
        this.School = School;
        this.Salary	= Salary;
    }
    public void setSchool(String School){
        this.School = School;
    }
    public void setSalary(double Salary){
        this.Salary = Salary;
    }
    public String getSchool(){
        return School;
    }
    public double getSalary(){
        return Salary;
    }
}
