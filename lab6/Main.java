package lab6;

/**
 * Created by kenterbery on 05.05.17.
 */
public class Main {

    public static void main(String[] args) {
        Taxis park = new Taxis(
                new PetrolCar("BMW M3", 1946507, 280, 8.8),
                new PetrolCar("Ford Focus", 578943, 190, 8.7),
                new ElectroCar("Smart ForTwo", 330000, 125),
                new ElectroCar("BMW i3", 1530000, 160),
                new DieselCar("Renault Duster", 451000, 170, 4.75),
                new DieselCar("Volkswagen Caddy", 378000, 186, 7.8)
        );
        System.out.println("Total cost: " + park.getTotalCost()+" uah");
        System.out.println("Sorted by fuel consumption:");
        for (int i = 0; i < park.size(); i++) {
            System.out.println(park.getCars(i));
        }
        Car found = park.findCarWithSuchSpeed(200, 280);
        if (found != null) {
            System.out.println("Between 200 and 280 kmph: "+found);
        }

    }
}
