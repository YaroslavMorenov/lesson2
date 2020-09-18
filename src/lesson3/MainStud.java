package lesson3;

public class MainStud {
    public static void main( String[] args ) {
        Student Vasya = new Aspirant(5,"Vasya","Vasliev","123","programming");
        Student[] students = new Student[4];
        students[0] = Vasya;
        students[1] = new Student(3,"Sasha","Ivanov","222");
        students[2] = new Aspirant(4,"Igor","Igorev","333","work");
        students[3] = new Student(5,"Serg","Sergoev","444");
        for (Student student : students) {
            System.out.println(student.getLastName() + " : " + student.getScholarship());
        }
    }
}
