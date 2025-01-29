package Array;
public class Array_trapped_water {
    public static void trapped_water(int height[]) {
        int n = height.length;

        // calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0]=height[0];
        for(int i = 1; i<n; i++) {
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        // calculate right max boundary - array
        int RightMax[] = new int [n];
        RightMax[n-1]=height[n-1];
        for(int i = n-2; i>=0; i--) {
            RightMax[i] = Math.max(height[i], RightMax[i+1]);
        }
        int trappedWater=0;

        // water level = min(left max boundary , right max boundary)
        for(int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i],RightMax[i]);
        
        // trapped water = water level - height[i]
        trappedWater+= waterLevel-height[i];
        }
       System.out.println("Trapped Water Level is = "+trappedWater+" Meter Cube ");
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        trapped_water(height);
    }
}
