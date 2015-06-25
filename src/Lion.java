/**
 * Created by poo2 on 25/06/2015.
 */
public class Lion extends Animal implements Jumpeable {
    @Override
    public void eat() {
        System.out.println("LION: " + getName() + " is eating!");
    }

    @Override
    public void jump() {
        System.out.println("LION: " + getName() + " is jumping!");
    }
}
