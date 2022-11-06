package it.unisa.bookshop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Bookshop {

    final private List<Book> bookshop;

    public Bookshop() {
        bookshop = new ArrayList<>();
    }

    public List<Book> findByAuthor(String author) {

        List<Book> f = new ArrayList<>();
        for(Book b : f)  {
            if(b.getAuthor().equals(author))
                f.add(b);
        }

        return f;
    }

    public List<Book> findByTitleContent(String titleContent) {
        List<Book> f = new ArrayList<>();

        for(Book b : f) {
            if(b.getTitle().equals(titleContent))
                f.add(b);
        }

        return f;
    }

    public List<Book> findMaxAvailable() {

        List<Book> f = new ArrayList<>();
        this.bookshop.sort(Collections.reverseOrder(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.numberOfCopies, o2.numberOfCopies);
            }
        }));
        int maxAvailableCopiesPerBook = this.bookshop.get(0).numberOfCopies;

        for (Book b : this.bookshop) {
            if (b.getNumberOfCopies() == maxAvailableCopiesPerBook) {
                f.add(b);
            }
        }
        return f;
    }

    public List<Book> findBelowAvailability(int threshold) {
        List<Book> f = new ArrayList<>();

        for(Book b : this.bookshop) {
            if(b.getNumberOfCopies() < threshold)
                f.add(b);
        }
        return f;
    }

    public List<Book> getBookshop() {
        return bookshop;
    }

    public void readUserDataFromFile(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);

        while (input.hasNextLine()) {
            String type = input.nextLine();
            String title = input.nextLine();
            String author = input.nextLine();
            String editor = input.nextLine();
            int numberOfCopies = Integer.parseInt(input.nextLine());
            if (type.equals("AudioBook")) {
                int length = Integer.parseInt(input.nextLine());
                String format = input.nextLine();
                AudioBook audio = new AudioBook(title, author, editor, length, format);
                audio.setNumberOfCopies(numberOfCopies);
                this.bookshop.add(audio);
            } else {
                Book bookToAdd = new Book(title, author, editor);
                bookToAdd.setNumberOfCopies(numberOfCopies);
                this.bookshop.add(bookToAdd);
            }
        }

    }
}
