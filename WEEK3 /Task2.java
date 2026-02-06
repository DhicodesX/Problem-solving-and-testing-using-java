import java.util.Scanner;

public class Task2 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        int n=s.length();
        for (int i=0; i<=n-k; i++){
            String ans = s.substring(i,i+k);
            if (ans.compareTo(smallest)<0){
                smallest = ans;
            }
            if(ans.compareTo(largest)>=0){
                largest= ans;
            }
        }
        
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
