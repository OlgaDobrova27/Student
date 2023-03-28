public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(111);
        Student s2 = new Student(111);
        System.out.println(s1.equels(s2));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
