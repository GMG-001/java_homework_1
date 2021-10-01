package homework;

public class Puppy extends Dog{

    public String color;

    public void setColor(){
        System.out.println("white");
    }
    public Puppy(){
        this.color="beige";
    }
    public Puppy(String color){
        this.color=color;
    }

}
