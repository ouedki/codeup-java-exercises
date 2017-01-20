package InterfacesEx;

/**
 * Created by apple on 1/20/17.
 */
public class CountTestApp {
    public static void main(String[] args) throws CloneNotSupportedException {

        //Creating and object of InterfacesEx.Alligator class and printing 3 alligators
        Alligator alligator1 = new Alligator();
        System.out.println("Counting Alligator;........");
        CountUtil.count(alligator1, 3);
        System.out.println();

        //Creating and object of InterfacesEx.Sheep class and printing 2 sheep
        Sheep sheep = new Sheep();
        sheep.setName("Blackie");
        System.out.println("Counting Sheep........");
        CountUtil.count(sheep, 2);
        System.out.println();

        //Cloning InterfacesEx.Sheep class, resetting the sheep counter and printing 2 cloned sheep
        Sheep clone = (Sheep) sheep.clone();
        clone.resetCount();
        clone.setName("Dolly");
        CountUtil.count(clone, 3);
        System.out.println();

        //Resetting the sheep counter and printing 1 sheep
        sheep.resetCount();
        CountUtil.count(sheep, 1);
        System.out.println();


    }
}
