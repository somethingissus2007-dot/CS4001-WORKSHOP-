import java.util.Scanner;

/**
 * Write a description of class question6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question6
{
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Base configuration
        double baseFare = 60;              // Flat charge
        double perKm = 30;                 // Rate per kilometer
        double perMinute = 2;              // Rate per minute
        double longDistanceDiscount = 0.20; // 10% discount for locals if distance > 15 km
        double nightSurcharge = 0.20;       // 20% extra at night

        // User input
        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter time (minutes): ");
        double time = sc.nextDouble();

        System.out.print("Is the customer local? (yes/no): ");
        String isLocalInput = sc.next().trim().toLowerCase();

        System.out.print("Is it night time? (yes/no): ");
        String isNightInput = sc.next().trim().toLowerCase();

        // Convert user input to boolean using ternary
        boolean isLocal = isLocalInput.equals("yes") ? true : false;
        boolean isNight = isNightInput.equals("yes") ? true : false;

        // Core fare computation
        double fare = baseFare + (distance * perKm) + (time * perMinute);

        // Apply long distance discount for locals
        fare = (isLocal && distance > 15) ? fare - (fare * longDistanceDiscount) : fare;

        // Apply night-time surcharge
        fare = isNight ? fare + (fare * nightSurcharge) : fare;

        // Output in Nepali-style format
        System.out.println("\nFinal Fare: Rs. " + (int)fare);
    }
}
