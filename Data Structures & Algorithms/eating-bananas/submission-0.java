class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        
        // The maximum possible speed needed is the size of the largest pile
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        
        int result = right;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if Koko can finish all bananas at speed 'mid'
            if (canFinish(piles, h, mid)) {
                result = mid;       // 'mid' is a valid speed, record it
                right = mid - 1;    // Try to find a smaller valid speed
            } else {
                left = mid + 1;     // 'mid' is too slow, increase speed
            }
        }
        
        return result;
    }

    private boolean canFinish(int[] piles, int h, int speed) {
        long totalHours = 0;
        
        for (int pile : piles) {
            // Calculate ceiling division: Math.ceil((double)pile / speed)
            totalHours += (pile + speed - 1) / speed;
        }
        
        return totalHours <= h;
    }
}
