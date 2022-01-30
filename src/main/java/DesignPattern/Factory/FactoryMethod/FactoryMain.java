package DesignPattern.Factory.FactoryMethod;

public class FactoryMain {
    public static void main(String[] args) {
        //in factory pattern ,we dont exopose the creation logic to the client and refer the created object using a standard interface .
        //the factory pattern is also known as virtual constructor
        //1.create a main class which call factory class
        //2.factory class returns required class interface
        ProfessionFactory professionFactory =new ProfessionFactory();
        Profession profession =professionFactory.getProfession("Doctor");
        profession.Print();
        Profession profession1 =professionFactory.getProfession("Teacher");
        profession1.Print();
        Profession profession2 =professionFactory.getProfession("Engineer");
        profession2.Print();

    }
}
