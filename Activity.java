class Activity{
    public static void main(String[] args){

        Dog dog = new Dog();
        dog.setName("Harry");

        System.out.println(dog.showName());
        System.out.println(dog.bark());

        dog.setNumber(3);
        System.out.println("The number of dog is: " + dog.showNumber());

        Dog dog1 = new Dog();
        dog1.name = "Haboc";
        Dog dog2 = new Dog();
        dog2.name = "Patal";
        Dog dog3 = new Dog();
        dog3.name = "Gonzales";
        
        Dog aso[] = {dog1, dog2, dog3};
        dog.setPuppies(aso);

        System.out.println("");
        
        dog.showPuppies();
    }
}