package DesignPattern.Factory.FactoryAbstract;



public class FactoryAbstractMain {
    public static void main(String[] args) {

        //AbstractFactory abstractFactory= AbstractFactoryProducer.getProfession(true);
        AbstractFactory abstractFactory= AbstractFactoryProducer.getProfession(false);
        Profession teacher =abstractFactory.getProfessiontype("teacher");

        teacher.Print();



    }
}
