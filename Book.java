/**
 * A class to represent a book.
 * Invariants: The pages cannot be less than or equal to 0.
 */
public class Book {
    /** Represents the title of the book. */
    private String title;
    /** Represents the author of the book. */
    private String author;
    /** Represents how many pages in the book; cannot be less than 0. */
    private int pages;

    /**
     * Default constructor to set default values for a Book object.
     */
    public Book() {
        this("No title", "Unknown", 10);
    }

    /**
     * Constructor to create a Book object given the required properties.
     * @param title A String that represents the title of the book.
     * @param author A String that represents the author of the book.
     * @param pages An int that represents the number of pages of the book; >= 1.
     */
    public Book(String title, String author, int pages) {
        setTitle(title);
        setAuthor(author);
        setPages(pages);
    }

    /** 
     * Changes the title of the book.
     * @param title A String of the title to change to.
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /** 
     * Changes the author of the book.
     * @param author A String of the author to change to.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /** 
     * Changes the pages of the book.
     * @param pages An int of the number of pages to change to.
     * Invariant: pages is set to 1 if it is <= 0.
     */
    public void setPages(int pages) {
        if (pages <= 0) {
            pages = 1;
        }
        this.pages = pages;
    }

    /** 
     * Returns the title of the book.
     * @return A String representing the title of the book.
     */
    public String getTitle() {
        return this.title;
    }

    /** 
     * Returns the author of the book.
     * @return A String representing the author of the book.
     */
    public String getAuthor() {
        return this.author;
    }

    /** 
     * Returns the pages of the book.
     * @return An int representing the number of pages of the book.
     */
    public int getPages() {
        return this.pages;
    }

    /**
     * Returns a string representation of the book.
     * @return A String representing the book's details.
     */
    @Override
    public String toString() {
        return "Book title: " + getTitle() + "\nAuthor: " + getAuthor() + 
        "\nNumber of pages: " + getPages();
    }

    /**
     * Checks whether two Book objects are equal.
     * @return true if the books are equal, false otherwise.
     */
    @Override
    public boolean equals(Object other) {
        // Checks for reference equality
        if (this == other) {return true;}
        // Checks for type equality
        if (!(other instanceof Book)) {return false;}
        // Checks for value equality; title and author must match; must type cast Book to other
        return title.equals(((Book) other).getTitle()) && author.equals(((Book) other).getAuthor());
    }

    /**
     * Checks whether the book is a long read.
     * @return true if the book is greater than or equal to 300 pages, false otherwise.
     */
    public boolean isLongRead() {
        return getPages() >= 300;
    }
}