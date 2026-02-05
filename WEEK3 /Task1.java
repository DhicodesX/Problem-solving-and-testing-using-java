import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read N
        int N = sc.nextInt();
        sc.nextLine(); // consume newline

        List<Student> students = new ArrayList<>();

        // Read student details
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int marks = sc.nextInt();

            students.add(new Student(name, marks));
        }

        // Read K
        int K = sc.nextInt();

        // Stream processing
        String result = students.stream()

            // Sort: marks desc, name asc
            .sorted((a, b) -> {
                if (a.marks != b.marks) {
                    return b.marks - a.marks;   // Descending marks
                }
                return a.name.compareTo(b.name); // Ascending name
            })

            // Take top K
            .limit(K)

            // Extract names
            .map(s -> s.name)

            // Join with space
            .collect(Collectors.joining(" "));

        // Print result
        System.out.println(result);
    }
}
