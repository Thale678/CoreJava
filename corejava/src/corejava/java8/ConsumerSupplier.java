package corejava.java8;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerSupplier {
    public static void main(String[] args) {
        System.out.println("hello");

       //Consumer will accept the input but will not return anything


        Consumer<String> c = s -> System.out.println(s.length());
        c.accept("Manish");
List<String> list = List.of("Manish", "Kumar", "Singh");
        list.forEach(c);

        for(String s : list){
            c.accept(s);
        }

        Consumer<List<String>> c1 = l -> l.forEach(
            s -> System.out.println(s.toUpperCase())
        );
        c1.accept(list);

        Consumer<List<String>> c2 = l -> l.forEach(
            s -> System.out.println(s.length())
        );
        c2.accept(list);

        System.out.println("And Then :");
        Consumer<List<String>> c3 = c1.andThen(c2);
        c3.accept(list);

        //Supplier will not accept any input but will return something
        Supplier<String> s = () -> "Manish";
        System.out.println(s.get());

    }
}
