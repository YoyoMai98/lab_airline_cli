public class Main {

    public static void main(String[] args) {

        Airline airline = new Airline("BNA");

        Option.chooseOption(airline);

        System.out.println("Actions recorded, thank you!");

    }
}
