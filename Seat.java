public class Seat {
    private boolean available;
    private String location;
    private int price;

    public Seat(){
        available = false;
        location = "";
        price = 0;
    }
    public Seat(boolean available, String location, int price){
        this.available = available;
        this.location = location;
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public boolean available(){
        return available;
    }
    public String getLocation(){
        return location;
    }
}
