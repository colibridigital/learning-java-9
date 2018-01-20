package Product3.Generics;

import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) {
        Student student1 = new Student("Joe", "Bloggs", 21, "joe.bloggs@gmail.com");
        Student student2 = new Student("Janice", "Bloggs", 23, "janice.bloggs@gmail.com");
        Student student3 = new Student("Tom", "Hanks", 45, "tom.hanks@gmail.com");
        Student student4 = new Student("George", "Clooney", 55, "george.clooney@gmail.com");

        Grade grade1 = new Grade(1, "D");
        Grade grade2 = new Grade(3, "C");
        Grade grade3 = new Grade(6, "B");
        Grade grade4 = new Grade(9, "A");


        TrainingCourse trainingCourse = new TrainingCourse("Learning Java 9");
        trainingCourse.addStudent(student1, grade1);
        trainingCourse.addStudent(student2, grade2);
        trainingCourse.addStudent(student3, grade3);
        trainingCourse.addStudent(student4, grade4);

        System.out.println("These are the students enrolled in the " + trainingCourse.getCourseName() + " course");
        System.out.println(trainingCourse.getListOfStudents().stream()
            .map(student -> student.getFirstName() + " " + student.getLastName())
            .collect(Collectors.toList()));

        System.out.println("The best grade is " + trainingCourse.getMaxGrade());
        System.out.println("The average grade is " + trainingCourse.getAverageGrade());
    }
}
