/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entety;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class book {
   private String bookName;
   private author[] authors;
   private int publisheYear;

    public book() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public author[] getAuthors() {
        return authors;
    }

    public void setAuthors(author[] authors) {
        this.authors = authors;
    }

    public int getPublisheYear() {
        return publisheYear;
    }

    public void setPublisheYear(int publisheYear) {
        this.publisheYear = publisheYear;
    }

    @Override
    public String toString() {
        return "book{" + "bookName=" + bookName + ", authors=" + Arrays.toString(authors) + ", publisheYear=" + publisheYear + '}';
    }

    public void setPublishedYear(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPublishedYear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
   
   
}
