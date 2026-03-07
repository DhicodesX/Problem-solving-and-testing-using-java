import java.util.*;

class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> res = new HashSet<>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            String a = words[i];
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                String b = words[j];
                if (b.contains(a)) {
                    res.add(a);
                }
            }
        } 
        return new ArrayList<>(res);
    }
}
