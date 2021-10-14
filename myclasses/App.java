
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entety.author;
import entety.book;
import entety.Histori;
import entety.Reader;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


/**
 *
 * @author user
 */
public class App {
    private Scanner scanner = new Scanner(System.in);
    private book[] books = new book[10];
    private Reader[] readers = new Reader[10];
    private Histori[] histories = new Histori[10];
    
    public void run(){
       String repeat = "r";
        do{
            System.out.println("Выберите номер задачи:");
            System.out.println("0: Закончить программу");
            System.out.println("1: Добавить книгу");
            System.out.println("2: Список книг");
            System.out.println("3: Добавить читателя");
            System.out.println("4: Список читателей");
            System.out.println("5: Выдать книгу читателю");
            System.out.println("6: Вернуть книгу");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    repeat="q";
                    System.out.println("Пока!");
                    break;
                case 1:
                    System.out.println("--- Добавление книги ---");
                    for (int i = 0; i < books.length; i++) {
                        if(books[i] == null){
                            books[i] = addBook();
                            break;
                        }
                        
                    }
                    break;
                case 2:
                    System.out.println("--- Список книг ---");
                    for (int i = 0; i < books.length; i++) {
                        if(books[i] != null){
                            System.out.println(books[i].toString());
                        }
                        
                    }
                    System.out.println("-------------------");
                    break;
                case 3:
                    System.out.println("--- Добавление читателя ---");
                    for (int i = 0; i < readers.length; i++) {
                        if(readers[i] == null){
                            readers[i] = addReader();
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("--- Список читателей ---");
                    for (int i = 0; i < readers.length; i++) {
                        if(readers[i] != null){
                            System.out.println(readers[i].toString());
                        }
                    }
                    System.out.println("-------------------");
                    break;
                case 5:
                    System.out.println("--- Выдача книги ---");
                    for (int i = 0; i < histories.length; i++) {
                        if(histories[i] == null){
                            histories[i] = addHistory();
                            System.out.println("Книга "+histories[i].getBook().getBookName()
                                                +" выдана читателю "+histories[i].getReader().getFamilyes()
                                                +" "+ histories[i].getReader().getName()
                            );
                            break;
                        }
                    }
                    System.out.println("-------------------");
                    break;
                case 6:
                    System.out.println("--- Возврат книги ---");
                    System.out.println("Список читаемых книг:");
                    int n = 0;
                    for (int i = 0; i < histories.length; i++) {
                        if(histories[i] != null && histories[i].getReturnDate()== null){
                            System.out.println(i+1+". Книгу "
                                    +histories[i].getBook().getBookName()
                                    +" читает "+histories[i].getReader().getFamilyes()
                                    +" "+histories[i].getReader().getName()
                            );
                            n++;
                        }
                    }
                    if(n < 1){
                        System.out.println("Нет читаемых книг!");
                        System.out.println("-------------------");
                        break;
                    }
                    System.out.print("Выберите номер возврщаемой книги: ");
                    int numberHistory = scanner.nextInt(); scanner.nextLine();
                    Calendar c = new GregorianCalendar();
                    histories[numberHistory - 1].setReturnDate(c.getTime());
                    System.out.println("Книга "
                            +histories[numberHistory - 1].getBook().getBookName()
                            +" возвращена в библиотеку"
                    );
                    System.out.println("-------------------");
                    break;
                default:
                    System.out.println("Выберите цифру из списка!");;
            }
        }while("r".equals(repeat));
    }
    private book addBook(){
        book book = new book();
        System.out.print("Введите название книги: ");
        book.setBookName(scanner.nextLine());
        System.out.print("Введите год изданиея книги: ");
        book.setPublisheYear(scanner.nextInt());scanner.nextLine();
        System.out.println("Введите автора книги ");
        System.out.print("Сколько авторов у книги: ");
        int countAuthors = scanner.nextInt();scanner.nextLine();
        author[] authors = new author[countAuthors];
        for (int i = 0; i < authors.length; i++) {
            author author = new author();
            System.out.println("Имя автора "+(i+1)+": ");
            author.setFirstname(scanner.nextLine());
            System.out.println("Фамилия автора: ");
            author.setLastname(scanner.nextLine());
            authors[i] = author;
        }
        book.setAuthors(authors);
        return book;
    }
    private Reader addReader(){
        Reader reader = new Reader();
        System.out.println("Имя читателя");
        reader.setFamilyes(scanner.nextLine());
        System.out.println("Фамилия читателя");
        reader.setName(scanner.nextLine());
        System.out.println("Телефон читателя");
        reader.setName(scanner.nextLine());
        return reader;
    }

    private Histori addHistory() {
        Histori history = new Histori();
        System.out.println("Список книг:");
        for (int i = 0; i < books.length; i++) {
            if(books[i] != null){
                StringBuilder sbAuthorNames = new StringBuilder();
                for (int j = 0; j < books[i].getAuthors().length; j++) {
                    sbAuthorNames.append(books[i].getAuthors()[j].getFirstname())
                                    .append(" ")
                                    .append(books[i].getAuthors()[j].getLastname())
                                    .append(". ");
                }
                
                System.out.println(i+1
                        +". "+books[i].getBookName()
                        +". "+books[i].getPublisheYear()
                        +". "+sbAuthorNames.toString()
                );
            }
        }
        System.out.print("Выберите номер книги: ");
        int numberBook = scanner.nextInt(); scanner.nextLine();
        System.out.println("Список читателей:");
        for (int i = 0; i < readers.length; i++) {
            if(readers[i] != null){
                System.out.println(i+1+". "+readers[i].toString());
            }
        }
        System.out.print("Выберити номер читателя: ");
        int numberReader = scanner.nextInt(); scanner.nextLine();
        history.setBook(books[numberBook-1]);
        history.setReader(readers[numberReader-1]);
        Calendar c = new GregorianCalendar();
        history.setGivenDate(c.getTime());
        
        return history;
    }
   
}
