public class Ticket {
    private Seat purchasedSeat;
    private Event event;

    public Ticket(){
        event = null;
        purchasedSeat = null;
    }
    public Ticket(Seat purchasedSeat, Event event){
        this.purchasedSeat = purchasedSeat;
        this.event = event;
    }
    public String getSeatLocation(){
        return purchasedSeat.getLocation();
    }
    public Event getEvent(){
        return event;
    }
}
