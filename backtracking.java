
public class backtracking{
    public static void permutation(String str, String perm, int index){
        if (str.length()==0) {
            System.out.println(perm);
            return;
            
        }
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            permutation(newStr, perm + curr, index + 1);
        }

    }
    public static void main(String[] args) {
        String str ="ABC";
        permutation(str, "", 0);
    
    }
}
