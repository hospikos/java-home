package homework12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jack", 25, 96));
        students.add(new Student("Mary", 19, 76));
        students.add(new Student("Ralf", 23, 84));
        students.add(new Student("John", 18, 97));
        students.add(new Student("Brenda", 21, 54));


        System.out.println("-".repeat(20));
        printAllNames(students);


        System.out.println("-".repeat(20));
        printStudentsOlderTwenty(students);

        System.out.println("-".repeat(20));
        printNameWhoScoredA(students);

        System.out.println("-".repeat(20));
        System.out.println("The average grade of students is: " + calculateAverageGrade(students));

        System.out.println("-".repeat(20));
        System.out.println("Student with the highest grade is: " + findHighestGradeStudent(students));

        System.out.println("-".repeat(20));
        System.out.println("The count of students which has grade less than 60 is: " + countStudentsWithLowGrade(students));


    }

    public static void printAllNames(List<Student> students) {
        students.stream()
                .map(Student::name)
                .forEach(System.out::println);
    }

    public static void printStudentsOlderTwenty(List<Student> students) {
        students.stream()
                .filter(student -> student.age() > 20)
                .forEach(System.out::println);

    }

    public static void printNameWhoScoredA(List<Student> students) {
        students.stream()
                .filter(student -> student.grades() >= 90)
                .forEach(System.out::println);
    }

    public static double calculateAverageGrade(List<Student> students) {
        return students.stream()
                .mapToDouble(Student::grades)
                .average()
                .orElse(0.0);

    }

    public static Student findHighestGradeStudent(List<Student> students) {
        return students.stream()
                .max(Comparator.comparing(Student::grades))
                .orElseThrow();
    }

    public static long countStudentsWithLowGrade(List<Student> students) {
        return students.stream()
                .filter(student -> student.grades() < 60)
                .count();

    }

}
