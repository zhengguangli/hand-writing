package wang.icopy.cammond;

import java.util.function.Function;

import java.util.function.UnaryOperator;

public class ProcessingTest {

    public static void main(String[] args) {
        
        useLambdaImplTest();

    }

    public static void useCammondTest() {
        ProcessingObject<String> p1 = new HeaderTextProcessing();
        ProcessingObject<String> p2 = new SpecialCheckProcessing();

        p1.setSuccessor(p2);

        String result = p1.handle("Aren't labda is really sexy? !!");

        System.out.println(result);
    }

    public static void useLambdaImplTest() {
        UnaryOperator<String> headerProcessing = s -> "From Roual, Mario And Alan: " + s;
        UnaryOperator<String> specialCheckProcessing = s -> s.replace("labda", "lambda");
        Function<String,String> pipeline =  headerProcessing.andThen(specialCheckProcessing);
        String result = pipeline.apply("Aren't labda is really sexy? !!");
        System.out.println(result);
    }
}
