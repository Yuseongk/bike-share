//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double tripMinutes = 138470.3;
        int roundTripMinute = (int)(tripMinutes + 0.5);
        double unlockFee = 10.0;
        double perMinute = 0.01;
        double deviceFee = tripMinutes * perMinute;
        double tax = (deviceFee + unlockFee) * 0.21;
        double total = deviceFee + tax;
        System.out.println("minutes: " + roundTripMinute);
        System.out.println("per-minute cost: " + perMinute);
        System.out.println("device fee:  " + deviceFee);
        System.out.println("tax: " + tax);
        System.out.println("total: " + total);
    }
}
