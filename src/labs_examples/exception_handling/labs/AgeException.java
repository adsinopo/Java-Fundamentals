package labs_examples.exception_handling.labs;

public class AgeException extends Exception{
    @Override
    public String toString(){
        return "Sorry you may not receive your license";
    }
}
