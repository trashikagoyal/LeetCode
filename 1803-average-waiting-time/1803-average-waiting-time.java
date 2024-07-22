class Solution {
    public double averageWaitingTime(int[][] customers) {
        long totalWaitingTime = 0; // Using long to handle large sums
        long currentTime = 0; // Using long to handle large sums

        for (int[] customer : customers) {
            int arrivalTime = customer[0];
            int preparationTime = customer[1];

            if (currentTime < arrivalTime) {
                currentTime = arrivalTime;
            }

            currentTime += preparationTime;
            totalWaitingTime += (currentTime - arrivalTime);
        }

        return (double) totalWaitingTime / customers.length;
    }
}
