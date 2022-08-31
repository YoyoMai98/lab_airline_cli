import java.util.Scanner;

public class Option {

    public static void chooseOption(Airline airline){
        Scanner reader = new Scanner(System.in);
        System.out.println("Available option: search, addFlight, cancelFlight, displayFlight, bookFlight, break");

        String chosenOption = reader.nextLine();

        switch (chosenOption){
            case "search":
                SearchFunction.searchFlightDestination(airline.getFlightList());
                chooseOption(airline);
                break;
            case "addFlight":
                airline.addFlight();
                chooseOption(airline);
                break;
            case "cancelFlight":
                try {
                    airline.cancelFlight();
                } catch (Exception exception){
                    exception.printStackTrace();
                }
                chooseOption(airline);
                break;
            case "displayFlight":
                airline.displayFlights();
                chooseOption(airline);
                break;
            case "bookFlight":
                Flight flight;
                try {
                    flight =  airline.chooseFlight();
                } catch (Exception exception){
                    flight = new Flight("");
                    exception.printStackTrace();
                }
                airline.bookFlight(flight);
                chooseOption(airline);
                break;
            case "break":
                break;
        }
    }
}
