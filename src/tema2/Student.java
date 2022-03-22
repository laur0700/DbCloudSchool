package tema2;

public class Student implements Comparable<Student>{
    String name;
    double grade;

    public Student(String name, Double grade){
        this.name = name;
        this.grade = grade;
    }

    public double getGrade(){
        return this.grade;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.grade;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.grade, o.getGrade());
    }
}
