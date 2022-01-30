package DesignPattern.Factory.FactoryAbstract;



public class ProfessionFactory extends AbstractFactory{

    public Profession getProfessiontype(String typeOfProfession){
        if(typeOfProfession==null)return null;

        if(typeOfProfession.equalsIgnoreCase("Teacher")){
            return new Teacher();

        }
        if(typeOfProfession.equalsIgnoreCase("Engineer")){
            return new Engineer();

        }
        return null;
    }

}
