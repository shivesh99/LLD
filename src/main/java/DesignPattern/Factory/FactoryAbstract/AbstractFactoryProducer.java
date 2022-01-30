package DesignPattern.Factory.FactoryAbstract;

public class AbstractFactoryProducer {
    //this is factory of factory ,which gives u factory instance(abstract factory implementation) which in turn give u required class

    public static AbstractFactory getProfession(boolean isTrainer){
        if(isTrainer==true)return new TraineeProfessionFactory();
        else return new ProfessionFactory();
    }
}
