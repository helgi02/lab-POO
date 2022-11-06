package it.unisa.railways;

import java.util.List;

public class ExpressTrain {
    private final TrainStop partenza;
    private final TrainStop arrivo;
    private List<TrainStop> trains;
    private final int seats;
    private final double distance;
    private final int restaurantSeats;

    public ExpressTrain(TrainStop partenza, TrainStop arrivo, List<TrainStop> trains, int seats, int restaurantSeats, double distance)  {
        this.partenza = partenza;
        this.arrivo = arrivo;
        this.trains = trains;
        this.seats = seats;
        this.restaurantSeats = restaurantSeats;
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

    public int getRestaurantSeats() {
        return restaurantSeats;
    }

    public int getTotalNumberOfStops() {
        return this.trains.size() + 2;
    }

    public double computeMaxRevenues(double trainPrice, double restPrice) {
        double tot1 = trainPrice * seats * distance;
        double tot2 = restPrice * restaurantSeats * distance;

        return tot1 + tot2;
    }


}
