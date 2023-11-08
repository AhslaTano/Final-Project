public class Event {
    private String eventName;
    private String location;
    private Seat[][] seats;
    private String date;

    public Event(){
        eventName = "";
        location = "";
        seats = null;
        date = "";
    }
    public Event(String eventName, String location, String date, int rows, int columns){
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        seats = new Seat[columns][rows];
        for(int c = 0; c < seats.length; c++){
            for(int r = 0; r < seats[0].length; r++){
                seats[c][r] = new Seat(true, "Row " + r + "Seat " + c, 10-r);
            }
        }
    }
    public String getEventName(){
        return eventName;
    }
    public String getLocation(){
        return location;
    }
    public String getDate(){
        return date;
    }

    public String availableSeats(){
        String availableSeats = "";
        for(int c = 0; c < seats.length; c++){
            for(int r = 0; r < seats[0].length; r++){
                if(seats[c][r].available()){
                    availableSeats = availableSeats + "\t" + seats[c][r];
                }
                availableSeats = availableSeats + "\n";
            }
        }
        return availableSeats;
    }
    public String toString(){
        return eventName + " held at " + location + ": " + date;
    }
}
