package w01.package1;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
 */
public class StudentTest {
  public static void main(String[] args) {
    /**
     * Create Student objects and access their attributes
     * Try using different access modifiers in Student to see how they work
     */
    Student stu = new Student();
    stu.studentId = "s123";
    stu.fullName = "John Smith";
    stu.major = "IT";

    System.out.println(stu.studentId + " " + stu.fullName
                      + " " + stu.major);
    
    // another way to print data
    System.out.printf("%s %s %s\n", stu.studentId, stu.fullName, stu.major);
  }
}
