package DesignPattern.Factory.FactoryMethod;

public class ProfessionFactory {

    public Profession getProfession(String typeOfProfession){
        if(typeOfProfession==null)return null;
        if(typeOfProfession.equalsIgnoreCase("Doctor")){
            return new Doctor();

        }
        if(typeOfProfession.equalsIgnoreCase("Teacher")){
            return new Teacher();

        }
        if(typeOfProfession.equalsIgnoreCase("Engineer")){
            return new Engineer();

        }
        return null;
    }

}
