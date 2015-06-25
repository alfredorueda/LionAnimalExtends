/**
 * Created by poo2 on 25/06/2015.
 */
public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("ANIMAL: "+name+" is eating!");
    }
}
