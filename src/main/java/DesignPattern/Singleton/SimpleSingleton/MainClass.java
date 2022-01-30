package DesignPattern.Singleton.SimpleSingleton;

public class MainClass {
    public static void main(String[] args) {
        SingletonClass singletonClass=SingletonClass.getInstance();
        singletonClass.SimpleMethod();
        SingletonClass singletonClass2=SingletonClass.getInstance();
        singletonClass2.SimpleMethod();
    }
}
