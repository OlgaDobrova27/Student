package equals4;

public class Student {
    private int id;
    public Student(int id){
        this.id = id;
    }

    public boolean equals(Object obj) {
        Student other = (Student) obj;
        if (id != other.id){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Student s1 = new Student(111);
        Student s2 = new Student(111);
        Student s3 = s1;
        Syste
    }
}
