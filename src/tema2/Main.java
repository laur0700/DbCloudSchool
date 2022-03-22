package tema2;

import java.util.*;

public class Main {
    private static void firstExercise(){
        System.out.println("\nPRIMUL EXERCITIU:");

        Map<Integer, TreeSet<Student>> studentMap = new HashMap<>();

        for(int i = 0; i <= 10; ++i){
            studentMap.put(i, (TreeSet<Student>) new TreeSet<Student>().descendingSet());
        }

        ArrayList<Student> studentArray = new ArrayList<>();

        Student s1 = new Student("Andrei", 8.49);
        Student s2 = new Student("Maria", 7.50);
        Student s3 = new Student("Emil", 4.45);
        Student s4 = new Student("Alexa", 5.24);
        Student s5 = new Student("Filip", 4.50);
        Student s6 = new Student("Laurentiu", 7.10);

        studentArray.add(s1);
        studentArray.add(s2);
        studentArray.add(s3);
        studentArray.add(s4);
        studentArray.add(s5);
        studentArray.add(s6);

        for(Student student : studentArray){
            studentMap.get((int)(Math.round(student.getGrade()))).add(student);
        }

        for(int i = 0; i <= 10; ++i){
            if(!studentMap.get(i).isEmpty())
                System.out.println("Nota " + i + ": " + studentMap.get(i));
        }
    }

    private static void secondExercise(){
        System.out.println("\nAL DOILEA EXERCITIU:");

        MyList<String> strings = new MyList<>(100);
        MyList<Integer> ints = new MyList<>(20);
        MyList<Student> students = new MyList<>(10);

        strings.add("Hello");
        strings.add("World");
        strings.add("!!!!!!!");
        strings.print();
        System.out.println("result of strings.lookup('Hello') -> " + strings.lookup("Hello"));
        System.out.println("result of strings.lookup('Samsung') -> " + strings.lookup("Samsung"));
        System.out.println('\n');

        ints.add(2);
        ints.add(3);
        ints.add(5);
        ints.add(7);
        ints.add(11);
        ints.print();
        System.out.println("result of ints.lookup(11) -> " + ints.lookup(11));
        System.out.println("result of ints.lookup(4) -> " + ints.lookup(4));
        System.out.println('\n');

        Student s1 = new Student("Andrei", 10.50);
        Student s2 = new Student("Laurentiu", 11.00);
        students.add(s1);
        students.add(s2);
        students.print();
        System.out.println("result of students.lookup(new Student('Ana', 5.50)) -> " + students.lookup(new Student("Ana", 5.50)));
        System.out.println("result of students.lookup(new Student('Laurentiu', 11.00)) -> " + students.lookup(new Student("Andrei", 10.50)));
        System.out.println("result of students.lookup(s2) -> " + students.lookup(s2));
        System.out.println('\n');
    }

    public static void main(String[] args) {
        firstExercise();
        secondExercise();
    }
}
