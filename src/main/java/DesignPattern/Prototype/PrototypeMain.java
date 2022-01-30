package DesignPattern.Prototype;

public class PrototypeMain {
    //Prototype pattern refers to creating duplicate object while keeping performance in mind
    //It involves implementing a prototype interface(here abstract class of Profession) which tells to create a clone of the current object.
    //This pattern is used when creation of object directly is costly .For example it requires data calls or
    // required too much of processing that will take llt of memory.

    //So we can cache the object ,returns its clone on the next request

    //Steps
    //1.create main class which call cacheimpl class̄
    //2.cachezimpl has two method :one to load map and other to return cloned object
    public static void main(String[] args) {

        ProfessionCache.loadProfessionCache();

        Profession docProfession =ProfessionCache.getCloneNewProfession(1);
        System.out.println(docProfession);

        Profession engProfession =ProfessionCache.getCloneNewProfession(2);
        System.out.println(engProfession);

        Profession teachProfession =ProfessionCache.getCloneNewProfession(3);
        System.out.println(teachProfession);

        Profession doc2Profession =ProfessionCache.getCloneNewProfession(1);
        System.out.println(doc2Profession);

    }
}
