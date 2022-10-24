import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenericsExample {

    public static void main(String[] args) {

//        Printer<Cat> printer = new Printer<>(23);
//        printer.print();
//
//        Printer<Dog> doublePrinter = new Printer<>(33.5);
//        doublePrinter.print();
//
//        ArrayList<Cat> cats = new ArrayList< >();
//        cats.add(new Cat());
        //for Generics Method
//        shout("John", 74);
//        shout(57);
//        shout(new Cat());

//        List<Integer> intList = new ArrayList<>();
//        intList.add(3);
      //  printList(intList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat() );
        printList(catList);
    }

    // Generics method
    // Create a method and print it out with exclamation points
//    private static <T, V> T shout(T thingToShout, V otherThingtoShout){
//        System.out.println(thingToShout + "!!!!!");
//        return thingToShout;
//    }


    // Wildcard
    // crate a method that can take a list that hold any type of object
    // print out the list
    private static void printList(List<? extends Animal> myList){
        System.out.println();

    }
}

