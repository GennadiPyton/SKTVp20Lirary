/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entety.book;
import entety.Histori;
import entety.Reader;
import interfaces.Keeping;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class KeeperToFile implements Keeping {

       @Override
    public void saveBooks(List<book> books) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("books");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(books);
            oos.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KeeperToFile.class.getName()).log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(KeeperToFile.class.getName()).log(Level.SEVERE, "Ошибка ввода", ex);
        }
    }

    @Override
    public List<book> loadBooks() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        List<book> books = new ArrayList<>();
        try {
            fis = new FileInputStream("books");
            ois = new ObjectInputStream(fis);
            books = (List<book>) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KeeperToFile.class.getName()).log(Level.SEVERE, "Файл books еще не создан", ex);
        } catch (IOException ex) {
            Logger.getLogger(KeeperToFile.class.getName()).log(Level.SEVERE, "Ошибка чтения books", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KeeperToFile.class.getName()).log(Level.SEVERE, "Нет класса", ex);
        }
        return books;
    }


    @Override
    public List<Reader> loadReaders() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveHistories(List<Histori> histories) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Histori> loadHistories() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveReaders(List<Reader> readers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
