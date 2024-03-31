package classes.exercise;
import java.util.List;

//The Book.java class you can see is mutable at the moment.
//Your task is to modify it so that it becomes fully immutable according to the instructions given in the lecture.
//Good luck!

public class Book {
    private String title;
    private String author;
    private int pageCount;
    private List<String> genres;

    public Book(String title, String author, int pageCount, List<String> genres) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.genres = genres;
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
        return genres;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }
}