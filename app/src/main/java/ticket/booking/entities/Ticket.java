package ticket.booking.entities;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Ticket {
    private String ticketId;
    private String userId;
    private String source;
    private String destination;
    private Train train;
    private String dateOfTravel;


    public Ticket(String ticketId, String userId, String source, String destination, Train train, String dateOfTravel) {
        this.ticketId = ticketId;
        this.userId = userId;
        this.source = source;
        this.destination = destination;
        this.train = train;
        this.dateOfTravel = dateOfTravel;
    }


    public Ticket() {}

    public String getTicketId() {
        return ticketId;
    }

    public String getUserId() {
        return userId;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public Train getTrain() {
        return train;
    }

    public String getDateOfTravel() {
        return dateOfTravel;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public void setDateOfTravel(String dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }
    public String getTicketInfo(){
        return String.format("Ticked ID %s belongs to user %s from %s to %s on %s",ticketId,userId,source,destination,dateOfTravel);
    }
}
