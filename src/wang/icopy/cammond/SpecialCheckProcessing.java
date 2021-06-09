package wang.icopy.cammond;

public class SpecialCheckProcessing extends ProcessingObject<String> {

    @Override
    public String handleWork(String s) {

        return s.replaceAll("labda", "lambda");
    }

}
