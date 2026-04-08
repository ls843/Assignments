public class VarargsAverager {
    public static double calculateAverage(double... numbers) {
        if(numbers.length == 0) {
            return 0;
        }

        double sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum / numbers.length;
    }

    public static void main(String[] args) {
        double avg1 = calculateAverage(10.0, 20.0);
        System.out.println("Average (2 numbers): " + avg1);

        double avg2 = calculateAverage(5.0, 10.0, 15.0, 20.0, 25.0);
        System.out.println("Average (5 numbers): " + avg2);

        double avg3 = calculateAverage();
        System.out.println("Average (no numbers): " + avg3);

        double[] values = {2.5, 3.5, 4.5};
        double avg4 = calculateAverage(values);
        System.out.println("Average (array): " + avg4);
    }
}
