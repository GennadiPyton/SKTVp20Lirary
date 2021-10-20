/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entety.book;
import entety.Histori;
import entety.Reader;
import java.util.List;



/**
 *
 * @author user
 */
public interface Keeping {
    public void saveBooks(List<book> book);
    public List<book> loadBooks();
    public void saveReaders(List<Reader> readers);
    public List<Reader> loadReaders();
    public void saveHistories(List<Histori> histories);
    public List<Histori> loadHistories();    
    
}
