public class RobotGrid {
    // Placeholder code for the main implementation class

    public boolean isSafe(int x, int y) {
        // TODO: Add implementation logic here
        int totalx = 0;
        int totaly = 0;

        int[] arr1 = Integer.toString(x).chars().map(c -> c - '0').toArray();
        for (int d : arr1) {
            System.out.print(d);
        }
        int[] arr2 = Integer.toString(y).chars().map(a -> a - '0').toArray();
        for (int b : arr2) {
            System.out.print(b);
        }

        for (int i = 0; i < arr1.length; i++) {
            totalx = totalx + arr1[i];
        }
        if (totalx <= 23 && totaly <= 23) {
            return true;
        } else {
            return false;
        }

        // throw new UnsupportedOperationException("Not implemented yet");

    }

    public int totalSafeSquares() {
        // TODO: Add implementation logic here
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int shortestSafeJourney(int a, int b, int x, int y) {
        // TODO: Add implementation logic here
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
