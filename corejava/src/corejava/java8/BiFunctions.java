package corejava.java8;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctions {

    public static void main(String[] args) {
        

BiPredicate<String,Integer> biPredicate = (s,i) -> s.length() == i;
System.out.println(biPredicate.test("Manish", 8));

BiFunction<String, String, Integer> biFunction = (s,i) -> s.concat(i).length();
System.out.println(biFunction.apply("Manish", "Thale"));
    

BiConsumer<String, Integer> biConsumer = (s,i) ->{
    for(int j=0; j<i; j++){
        System.out.println(s);
    }
  };
  
  biConsumer.accept("Manish", 5);

}

  
  
    
}

