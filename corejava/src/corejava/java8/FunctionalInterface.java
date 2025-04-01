package corejava.java8;

//@FunctionalInterface

public interface FunctionalInterface{
    void performOperation(String input);
    //Default method in interface
    //Default methods were introduced in Java 8 to allow the addition of new methods to interfaces without breaking the classes that already use them.
    //A default method is a method that has a body, and it provides a default implementation for the method.
    //Default methods are defined using the default keyword.
    //Default methods can be overridden by classes that implement the interface.

     default void display(String input){
             System.out.println("Displaying FunctionalInterface: "+input);
         }
//Static method in interface
//Static methods were introduced in Java 8 to allow the addition of utility methods to interfaces.
//A static method is a method that has a body, and it does not require an instance of the interface to be called.   
//Static methods are defined using the static keyword.You can call a static method using the interface name direectly.
//Static methods cannot be overridden by classes that implement the interface.

     static void SayHello(String input){
         System.out.println("Satic Method1: "+input);
     }
     //we can add main method in ja
     public static void main(String[] args) {
        System.out.println("Main method in interface");
     }

} 
 interface FunctionalInteBrface1{
    void performOperation(String input);
     default void display(String input){
             System.out.println("Displaying FunctionalInterface1 "+input);
         }

         static void SayHello(String input){
            System.out.println("Satic Method2: "+input);
        }
}


class child implements FunctionalInterface,FunctionalInteBrface1{
    public void performOperation(String input){
        System.out.println("Performing operation on: "+input);
    }
    @Override
    public void display(String input) {
        // TODO Auto-generated method stub

        //When class implements inteface having two daefault methods with same name, then it is mandatory to override the method
        //and provide the implementation for the method.
        System.out.println("OverridenMethod : "+input);
        //Or call the default method of the interface using super keyword
        FunctionalInterface.super.display(input);
        FunctionalInteBrface1.super.display(input);
    }
    public static void main(String[] args) {
        child c = new child();
        c.performOperation("Hello");
        c.display("Hello");
        FunctionalInterface.SayHello("Hello");
        FunctionalInteBrface1.SayHello("Hello");

        
    }
}
//A functional interface is defined as an interface that contains exactly one abstract method.
//The @FunctionalInterface annotation is used to ensure that the interface is a functional interface.
//If you try to add another abstract method to the interface, the compiler will throw an error.
//You can add default and static methods to a functional interface without any issues.
//Functional interfaces are used to provide an implementation for lambda expressions.
//Functional interfaces can extend other functional interfaces only.