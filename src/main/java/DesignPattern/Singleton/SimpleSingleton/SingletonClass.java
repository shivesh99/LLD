package DesignPattern.Singleton.SimpleSingleton;

public class SingletonClass {
    //This pattern involves a single class which is responsible to create an object while making sure that only single object gets created.
    //This class provides a way to access its only object which can be accessed directly without need to instantiate hte object of the class.
    //steps
    //1.creating object only once using private static
    //2.private constructor
    //3.only getter ,no setter


//Eager way implementing singleton pattern
    private static SingletonClass singletonInstance= new SingletonClass();

    private SingletonClass(){

    }

    //Eager way
    public static SingletonClass getInstance(){
        return singletonInstance;
    }
    public void SimpleMethod(){
        System.out.println("hashcode of singleton object"+ singletonInstance);
    }




}
