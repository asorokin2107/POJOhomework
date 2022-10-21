public final class Book {

    private final String autor;
    private final String name;
    private final int pageCount;
    private final String isbn;

    public Book(String autor, String name, int pageCount, String isbn) {
        this.autor = autor;
        this.name = name;
        this.pageCount = pageCount;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getName() {
        return name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getIsbn() {
        return isbn;
    }
}
