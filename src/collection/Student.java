package collection;

/**
 *
 * @author Marwa
 */
public class Student implements Comparable<Student> {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Compare to age of next Object
    @Override
    public int compareTo(Student object) {
        if (this.age == object.age) {
            return 0;
        } else if (this.age > object.age) {
            return 1;
        } else {
            return -1;
        }
    }

}
