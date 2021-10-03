package homework;

public class Puppy extends Dog{

    public String color;
    protected String name;

    public void setColor(){
        System.out.println("white");
    }
    public Puppy(){
        this.color="beige";
    }
    public Puppy(String color){
        this.color=color;
    }

    public String getName(){
        return this.name="joe";
    }

    public String getSex(){
        return this.sex="male";
    }

}
