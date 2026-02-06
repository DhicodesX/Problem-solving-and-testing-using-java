import java.util.*;

class Task2 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {

            String s = sc.nextLine();
            int len = s.length();
            int mid = len / 2;

            int[] freq = new int[26];
            for (int j = 0; j < mid; j++) {
                freq[s.charAt(j) - 'a']++;
            }

        
            for (int j = (len % 2 == 0 ? mid : mid + 1); j < len; j++) {
                freq[s.charAt(j) - 'a']--;
            }

            boolean ok = true;

            for (int x : freq) {
                if (x != 0) {
                    ok = false;
                    break;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}

