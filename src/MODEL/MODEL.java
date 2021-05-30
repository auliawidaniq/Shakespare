/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import Tampilan.*;

/**
 *
 * @author Aulia
 */
public class MODEL {
     private int Price, Book_ID, Stock;
     private String Book_Name;
    
    
     public MODEL(int Book_ID, String Book_Name, int Price, int Stock ) {
        this.Book_ID = Book_ID;
        this.Book_Name= Book_Name;
        this.Price = Price;
        this.Stock = Stock;
    }
public int getBook_ID() {
        return Book_ID;
    }

    public void setBook_ID(int Book_ID) {
        this.Book_ID = Book_ID;
    }
   
public String getBook_Name() {
        return Book_Name;
    }

    public void setBookName(String Book_Name) {
        this.Book_Name= Book_Name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }
      public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
}