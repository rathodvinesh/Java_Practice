package Practice.Nimap;

class KthLarge {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2; // Find 2nd largest

        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }

        int[] count = new int[max + 1];
        for (int num : arr) {
            count[num]++;
        }

        int found = 0;
        for (int i = max; i >= 0; i--) {
            found += count[i];
            if (found >= k) {
                System.out.println(i);
                break;
            }
        }
    }
}
