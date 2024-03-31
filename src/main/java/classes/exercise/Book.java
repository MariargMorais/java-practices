package classes.exercise;
import java.util.ArrayList;
import java.util.List;

//The Book.java class you can see is mutable at the moment.
//Your task is to modify it so that it becomes fully immutable according to the instructions given in the lecture.
//Good luck!

final class Book {
    private final String title;
    private final String author;
    private final int pageCount;
    private final List<String> genres;

    public Book(String title, String author, int pageCount, List<String> genres) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.genres = new ArrayList<>(genres);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public List<String> getGenres() {
        return new ArrayList<>(genres);
    }
}