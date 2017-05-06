/**
 * Created by kenterbery on 02.03.17.
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Student {

    public String firstname;
    public String lastname;
    private int age;
    private int course;
    private boolean scholarship;

//     Конструктор
    public Student(String firstname, String lastname, int age, int course, boolean scholarship) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.course = course;
        this.scholarship = scholarship;
    }


//     Геттери приватних полів
    public int getAge() {
        return age;
    }
    public int getCourse() {
        return course;
    }
    public boolean getScolarship() {
        return scholarship;
    }
//      Сортування за віком
    public static Comparator<Student> ageComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getAge()-o1.getAge();
        }
    };
    public static Comparator<Student> courseComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCourse()-o2.getAge();
        }
    };

    public static void main(String[] args) {
//        Створюємо об'єкти
        Student BabkoD = new Student("Дмитро", "Бабко", 17, 1, true);
        Student AdamsT = new Student("Том", "Адамс", 19, 3, true);
        Student BratunA = new Student("Андрій", "Братун", 18, 1, true);
        Student GrybkoD = new Student("Дмитро", "Грибко", 23, 6, false);
        Student ZavadkoA = new Student("Андрій", "Завадко", 21, 4, false);

        Student[] university = {BabkoD, AdamsT, BratunA, GrybkoD, ZavadkoA};
        System.out.println("Створені об'єкти: ");
        for (int i=0; i<university.length; i++) {
            System.out.println("Ім'я: " + university[i].firstname + " " + university[i].lastname + ", курс: " +
            university[i].getCourse() + ", вік: " + university[i].getAge() + ", стипендія: " + university[i].getScolarship());
    }
        System.out.println();
        Arrays.sort(university, ageComparator);
        System.out.println("Сортування за віком: ");
        for (int i = 0; i < university.length; i++){
            System.out.println("Ім'я: " + university[i].firstname + " " + university[i].lastname + ", курс: " +
                    university[i].getCourse() + ", вік: " + university[i].getAge() + ", стипендія: " + university[i].getScolarship());
        }
        System.out.println();
        Arrays.sort(university, courseComparator);
        System.out.println("Сортування за віком: ");
        for (int i = 0; i < university.length; i++) {
            System.out.println("Ім'я: " + university[i].firstname + " " + university[i].lastname + ", курс: " +
                    university[i].getCourse() + ", вік: " + university[i].getAge() + ", стипендія: " + university[i].getScolarship());
        }
    }
}
