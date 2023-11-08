import java.util.*;
public class Users {
    private String username;
    private String password;
    private int points;
    private List<Ticket> purchased;
    private String name;
    private String address;

    public Users(){
        username = "";
        password = "";
        points = 0;
        purchased = null;
        name = "";
        address = "";
    }
    public Users(String username, String password, String name, String address){
        this.username = username;
        this.password =  password;
        points = 30;
        purchased = new ArrayList<Ticket>();
        this.name = name;
        this.address = address;
    }
    public String getUsername(){
        return username;
    }
    public void changeUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void changePassword(String password){
        this.password = password;
    }
    public int getPoints(){
        return points;
    }
    public void viewPurchasedTickets(){
        for(Ticket ticket : purchased){
            System.out.println(ticket.toString());
        }
    }
    public void spendPoints(Seat ticket){
        points -= ticket.getPrice();
    }
    public String viewProfile(){
        return username + ": \n" + name + "\n" + address + "\nPoints available: " + points;
    }
}
