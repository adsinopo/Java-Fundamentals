package labs_examples.exception_handling;

public class UnderageException extends Exception{
    @Override
    public String toString() {
        return "Sorry kid, you must be 21 to purchase alcohol in the USA";
    }
}
