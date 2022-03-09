package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class BookController {
    //example of implementing interfaces
    public static void main(String[] args) {
        Books books = new Books("Dark Matter", true, 450);
        books.chapterOne();

        Fiction fiction = new Fiction("The Silent Patient", true, 325, "mystery",
                "present day", false);
        fiction.chapterFive();
    }
}
