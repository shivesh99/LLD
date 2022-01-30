package DesignPattern.Factory.FactoryMethod;

public class Doctor implements Profession{

    @Override
    public void Print() {
        System.out.println("Printing from doctor class !!");
    }
}
