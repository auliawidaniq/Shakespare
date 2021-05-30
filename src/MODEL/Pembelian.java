
package MODEL;

/**
 *
 * @author Victoria
 */
public class Pembelian {
    private int ID_User, BookID, Total_Item;
    private String BookName, Price, Total_Payment;
    
    public Pembelian(int ID_User, int BookID, String BookName, int Total_Item,
            String Price, String Total_Payment){
        this.ID_User = ID_User;
        this.BookID = BookID;
        this.BookName = BookName;
        this.Total_Item = Total_Item;
        this.Price = Price;
        this.Total_Payment = Total_Payment;
    }
    
    public void setID_User(int ID_User){
        this.ID_User = ID_User;
    }
    public int getID_User(){
        return ID_User;
    }
    public void setBookID(int BookID){
        this.BookID = BookID;
    }
    public int getBookID(){
        return BookID;
    }
    public void setBookName(String BookName){
        this.BookName = BookName;
    }
    public String getBookName(){
        return BookName;
    }
    public void setTotal_Item(int Total_Item){
        this.Total_Item = Total_Item;
    }
    public int getTotal_Item(){
        return Total_Item;
    }
    public void setPrice(String Price){
        this.Price = Price;
    }
    public String getPrice(){
        return Price;
    }
    public void setTotal_Payment(String Total_Payment){
        this.Total_Payment = Total_Payment;
    }
    public String getTotal_Payment(){
        return Total_Payment;
    }
}
