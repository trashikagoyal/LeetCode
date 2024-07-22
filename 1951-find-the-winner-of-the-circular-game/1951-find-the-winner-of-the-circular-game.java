
class Solution {

    public int findTheWinner(int n, int k) {

        List<Integer> friends = new ArrayList<>();

        

        // Initialize the circle of friends

        for (int i = 1; i <= n; i++) {

            friends.add(i);

        }

        

        int index = 0;

        

        // Simulate the game until there is only one friend left

        while (friends.size() > 1) {

            // Calculate the index of the friend to be removed

            index = (index + k - 1) % friends.size();

            

            // Remove the friend at the calculated index

            friends.remove(index);

        }

        

        // Return the winner of the game

        return friends.get(0);

    }

}


