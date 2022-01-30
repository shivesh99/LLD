package DesignPattern.Factory.FactoryAbstract;



public class Engineer implements Profession {
    @Override
    public void Print() {
        System.out.println("Printing from Engineer class!!");
    }
}
