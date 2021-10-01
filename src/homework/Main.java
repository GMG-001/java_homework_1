package homework;

public class Main {
    public static void main(String[] args){
        //კლასებისა და მეთოდების ინიციალიზაცია
        Dog dog=new Dog();
        Puppy puppy=new Puppy();
        Puppy puppy1=new Puppy("black");

        //მემკვიდრეობითობის შემოწმება
        dog.setBreed();
        puppy.setBreed();

        //method overriding-სი მაგალითი
        dog.setColor();
        puppy.setColor();

        //method overloading-ის მაგალითი
        System.out.println(puppy.color);
        System.out.println(puppy1.color);
    }
}
