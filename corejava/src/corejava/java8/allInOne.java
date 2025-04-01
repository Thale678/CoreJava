package corejava.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class allInOne {

    public static void main(String[] args) {
        
    Predicate<Integer> predicate = n -> n%2 ==0;
    Function<Integer, Integer> f1 = s -> s * s;
    Consumer<Integer> c = s -> System.out.println(s);
    Supplier<Integer> s = () -> 50;

   if(predicate.test(s.get())){
         c.accept(f1.apply(s.get()));
   }

    
}

}
