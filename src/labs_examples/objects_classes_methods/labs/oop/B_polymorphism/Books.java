package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Books implements HowToRead {
    String title;
    boolean fiction;
    int pages;

    //This is an example of Overloading...Polymorphism
    public Books(){

    }

    public Books(String title, boolean fiction, int pages) {
        this.title = title;
        this.fiction = fiction;
        this.pages = pages;
    }

    public void print(){
        System.out.println(title + " is " + pages + " long.");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isFiction() {
        return fiction;
    }

    public void setFiction(boolean fiction) {
        this.fiction = fiction;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", fiction=" + fiction +
                ", pages=" + pages +
                '}';
    }

    @Override
    public void chapterOne() {
        System.out.println("Beginning Chapter One of... " + title + ".");
    }

    @Override
    public void chapterFive() {
        System.out.println("Beginning Chapter Five of... " + title + ".");
    }

    @Override
    public void finished() {
        System.out.println("I am finished with the novel " + title + ".");
    }
}
