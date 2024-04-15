package lt.eif.viko.m.nar.client;

import lt.eif.viko.m.nar.client.generated_classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderPortService service = new OrderPortService();
        OrderPort port = service.getOrderPortSoap11();

        GetAllTripRequest request = new GetAllTripRequest();
        GetAllTripResponse response = port.getAllTrip(request);

        List<Trip> trips = new ArrayList<>();
        trips.addAll(response.getAllTrips());
        for(Trip trip: trips){
            System.out.println(trip.toString());
        }

        GetOrderRequest request1 = new GetOrderRequest();
        request1.setId(1);
        GetOrderResponse response1 = port.getOrder(request1);
        System.out.println(response1.getOrder().toString());
    }
}
