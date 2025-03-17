public class backtracking {
    // String Permutation (Same as before)
    public static void permutation(String str, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutation(newStr, perm + curr);
        }
    }

    // Number Permutation Using Boolean Array
    public static void numPermutation(int arr[], boolean used[], String perm) {
        if (perm.length() == arr.length * 2 - 1) { // Because numbers are separated by spaces
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                numPermutation(arr, used, perm + arr[i] + " "); // Add number with space
                used[i] = false; // Backtrack
            }
        }
    }

    public static void main(String[] args) {
        // String Permutations
        String str = "ABC";
        System.out.println("String Permutations:");
        permutation(str, "");

        // Number Permutations
        int arr[] = {1, 2, 3};
        boolean used[] = new boolean[arr.length]; // Track used elements
        System.out.println("\nNumber Permutations:");
        numPermutation(arr, used, "");
    }
}
