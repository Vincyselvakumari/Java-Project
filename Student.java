public class Student {
    private final String name;
    private final int age;
    private final String course;
    private final String collegeName;
    private final String studentId;

    // Constructor
    public Student(String name, int age, String course, String collegeName, String studentId) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.collegeName = collegeName;
        this.studentId = studentId;
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("----- Student Profile -----");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Course       : " + course);
        System.out.println("College Name : " + collegeName);
        System.out.println("----------------------------");
}
}