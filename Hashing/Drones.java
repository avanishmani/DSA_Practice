package Hashing;

import java.util.PriorityQueue;

public class Drones {
    public static int minTime(int k, int[] drones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int drone : drones) {
            pq.add(drone);
        }
        int time = 0;
        while (k > 0) {
            int drone = pq.poll();
            time = drone;
            pq.add(drone * 2);
            k--;
        }
        return time;
    }

    public static void main(String[] args) {
        int k = 10;
        int[] drones = {6, 6, 4, 3, 4, 9, 3, 2, 6, 10};
        System.out.println(minTime(k, drones));
    }
}
