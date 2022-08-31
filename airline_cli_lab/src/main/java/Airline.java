import java.util.ArrayList;
import java.util.Scanner;

public class Airline {

    private String name;
    private ArrayList<Flight> flightList;

    public Airline (String name){
        this.name = name;
        this.flightList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }

    public void addFlight (){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in the flight destination: ");

        String destination = reader.nextLine();

        Flight flight = new Flight(destination);
        this.flightList.add(flight);
    }

    public String cancelFlight () throws Exception{
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in the flight id: ");

        String id = reader.nextLine();

        for(Flight flight : flightList){
            if(id.equals(flight.getId())){
                this.flightList.remove(flight);
                return "This flight has been cancelled.";
            }
        }

        throw new Exception("Flight not found!");
    }

    public Flight chooseFlight() throws Exception{
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in the flight id");

        String id = reader.nextLine();

        for(Flight flight : this.flightList){
            if(id.equals(flight.getId())){
                return flight;
            }
        }

        throw new Exception("The flight is not found!");
    }

    public String bookFlight(Flight flight){
        if(flight.getDestination().isEmpty()){
            return "Flight not found";
        }
        Scanner reader = new Scanner(System.in);
        System.out.println("Please type in your name and mobile number (split by a space): ");

        String input = reader.nextLine();
        String[] passengerDetail = input.split(" ");

        String passengerName = passengerDetail[0];
        int passengerMobileNumber = Integer.parseInt(passengerDetail[1]);

        Passenger passenger = new Passenger(passengerName, passengerMobileNumber);

        flight.addPassenger(passenger);

        return passengerName + " has been booked onto the flight.";
    }

    public void displayFlights(){
        for (Flight flight : flightList){
            System.out.println(flight.toString());
        }
    }

}
