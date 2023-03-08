package w01.package2;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
 */
public class StudentTest2 {
  public static void main(String[] args) {
    /**
     * Create Student objects and access their attributes
     * Try using different access modifiers in Student to see how they work
     */

    /**
     * To acces Student class in this package,
     * either use its fully-qualified name (name with the prefix package name),
     * or "import" it first, then use it as it is in the same package
     */

    var stu = new w01.package1.Student();

    /**
     * From Java 10, if the type of a variable can be determined automatically,
     * you can use "var" to declare its type. For example
     * var stu = new w01.package1.Student();
     */

    stu.studentId = "s123";
    stu.fullName = "John Smith";
    stu.major = "IT";

    System.out.println(stu.studentId + " " + stu.fullName
                      + " " + stu.major);
    
    // another way to print data
    System.out.printf("%s %s %s\n", stu.studentId, stu.fullName, stu.major);
  }
}
