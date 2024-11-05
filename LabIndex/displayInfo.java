class Student {
    String name;
    int age;
    String course;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.course = "Not Assigned";
    }

    // Constructor with one parameter
    public Student(String name) {
        this.name = name;
        this.age = 0;
        this.course = "Not Assigned";
    }

    // Constructor with two parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.course = "Not Assigned";
    }

    // Constructor with three parameters
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        // Using different constructors
        Student student1 = new Student();
        Student student2 = new Student("Alice");
        Student student3 = new Student("Bob", 21);
        Student student4 = new Student("Charlie", 22, "Computer Science");

        // Displaying information
        System.out.println("Student 1:");
        student1.displayInfo();
        
        System.out.println("\nStudent 2:");
        student2.displayInfo();
        
        System.out.println("\nStudent 3:");
        student3.displayInfo();
        
        System.out.println("\nStudent 4:");
        student4.displayInfo();
    }
}
