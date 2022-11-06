package it.unisa.railways;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private final TrainStop partenza;
    private final TrainStop arrivo;
    private List<TrainStop> trains;
    private final int seats;
    private final double distance;

    public Train(TrainStop partenza, TrainStop arrivo, List<TrainStop> trains, int seats, double distance)  {
        this.partenza = partenza;
        this.arrivo = arrivo;
        this.trains = trains;
        this.seats = seats;
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public int getSeats() {
        return seats;
    }

    public TrainStop getArrivo() {
        return arrivo;
    }

    public TrainStop getPartenza() {
        return partenza;
    }

    public int getTotalNumberOfStops() {

        return this.trains.size()+ 2;
    }

    public double computeMaxRevenues(double trainPrice) {
        double tot1 = trainPrice * seats * distance;

        return tot1;
    }


}