package ticket.booking.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;
import java.util.Map;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Train {
    private String trainId;
    private String trainNo;
    // we will use 2d lists for train seats
    private List<List<Integer>> seats; // 0 = not booked, 1 = booked
    private Map<String, String> stationnTimes;
    private List<String> stations; // to store which stations the train goes

    // Default constructor
    public Train() {}

    // Parameterized constructor
    public Train(String trainId, String trainNo, List<List<Integer>> seats,
                 Map<String, String> stationnTimes, List<String> stations) {
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.seats = seats;
        this.stationnTimes = stationnTimes;
        this.stations = stations;
    }

    public String getTrainId() {
        return trainId;
    }


    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }

    public Map<String, String> getStationTimes() {
        return stationnTimes;
    }

    public void setStationnTimes(Map<String, String> stationnTimes) {
        this.stationnTimes = stationnTimes;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }
    public String getTrainInfo(){
        return String.format("Train ID is %s Train No is %s",trainId,trainNo);
    }


}
