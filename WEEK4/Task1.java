class Task1 {
    public boolean halvesAreAlike(String s) {
        int n= s.length();
        int mid= n/2;
        int c1=0;
        int c2=0;
        for (int i=0; i<mid; i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                c1+=1;
            }
        }
        for (int i=mid; i<n; i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                c2+=1;
            }
        }
        if (c1==c2)
            return true;
        return false;
    }
}
