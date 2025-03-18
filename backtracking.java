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
    public static void numPermutation(int arr[], boolean used[], String per) {
       if(per.length()==arr.length*2-1){
        System.out.println(per);
        return;
       }
       for(int i=0;i<arr.length;i++){
        if(!used[i]){
        used[i]=true;
        numPermutation(arr, used, per+arr[i]+"");
        used[i]=false;

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
        boolean used[] =new boolean[arr.length];
        System.out.println("\nNumber Permutations:");
        numPermutation(arr, used, "");
    }

   
}
