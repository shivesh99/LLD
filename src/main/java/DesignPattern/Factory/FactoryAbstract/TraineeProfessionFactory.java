package DesignPattern.Factory.FactoryAbstract;



public class TraineeProfessionFactory extends AbstractFactory {
    @Override
    Profession getProfessiontype(String professiontype) {
        if(professiontype==null)return null;

        if(professiontype.equalsIgnoreCase("Teacher")){
            return new TraineeTeacher();

        }
        if(professiontype.equalsIgnoreCase("Engineer")){
            return new TraineeEngineer();

        }
        return null;
    }

}
