import java.util.ArrayList;
import java.util.Scanner;

public class SearchFunction {

    public static void searchFlightDestination(ArrayList<Flight> flightList){
        Scanner reader = new Scanner(System.in);
        System.out.println("where do you want to go?");
        String destination = reader.nextLine();
        for (Flight flight : flightList){
            if (destination.equals(flight.getDestination())){
                System.out.println(flight.toString());

            }

        }

    }





}
