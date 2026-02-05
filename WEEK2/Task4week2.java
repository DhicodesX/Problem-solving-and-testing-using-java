import java.util.*;
import java.util.stream.*;

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static boolean isOlderThanLimit(Person p, int limit) {
        return p.getAge() > limit;
    }
}

public class Task4week2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 

        List<Person> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();

            list.add(new Person(name, age));
        }

        int ageLimit = sc.nextInt(); 

        String sortedNames = list.stream()
                .map(Person::getName)   
                .sorted(String::compareTo) 
                .collect(Collectors.joining(" "));

        System.out.println(sortedNames);


        String filteredNames = list.stream()
                .filter(p -> Person.isOlderThanLimit(p, ageLimit))
                .map(Person::getName)
                .collect(Collectors.joining(" "));

        System.out.println(filteredNames);

        String upperCaseNames = list.stream()
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.joining(" "));

        System.out.println(upperCaseNames);

        sc.close();
    }
}
