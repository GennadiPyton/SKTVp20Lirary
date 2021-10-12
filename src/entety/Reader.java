/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entety;

/**
 *
 * @author user
 */
public class Reader {
    private String name;
    private String familyes;
    private String telefon;

    public Reader() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyes() {
        return familyes;
    }

    public void setFamilyes(String familyes) {
        this.familyes = familyes;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Reader{" + "name=" + name + ", familyes=" + familyes + ", telefon=" + telefon + '}';
    }
    
    
}
