package wang.icopy.cammond;

public class HeaderTextProcessing extends ProcessingObject<String>{
    
    @Override
    public String handleWork(String s) {
        return "From Roual "+s;
    }

}
