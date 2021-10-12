/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;
import entety.Histori;
import entety.author;
import entety.book;
import entety.Reader;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author user
 */
public class App {

    public void run(){
        book book1 = new book();
        book1.setBookName("Voina i mir");
        
        
        author author1 = new author();
        author1.setFirstname("Lev");
        author1.setLastname("Tolstoy");
        author[] authors = new author[1];
        authors[0]=author1;
        
        
        book1.setAuthors(authors);
        book1.setPublisheYear(2021);
        
        
        Reader reader1 = new Reader();
        reader1.setName("Nikita");
        reader1.setFamilyes("Nikolaev");
        reader1.setTelefon("3754815715348");
        
        
        Histori histori1 = new Histori();
        histori1.setBook(book1);
        histori1.setReader(reader1);
        Calendar c = new GregorianCalendar();
        histori1.setGivenDate(c.getTime());
        System.out.println(histori1.toString());
        
        histori1.setReturnDate(c.getTime());
        
        
    }

   
}
