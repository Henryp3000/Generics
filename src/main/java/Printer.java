import java.io.Serializable;

public class Printer <T, V>{

    // T Stands for type can be any symbol you want but T is standard

    T thingToPrint;
    V otherThings;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }
//    public void print() {
//        thingToPrint.eat();
//        System.out.println(thingToPrint);
//    }

}
