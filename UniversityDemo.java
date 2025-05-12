public class UniversityDemo {
    public static void main(String[] args) {
        College university = new College("New Era University");

        College engCollege = new College("College of Engineering");
        Department csDept = new Department("Department of Computer Science");
        csDept.addUnit(new Teacher("Prof. Cruz", "Algorithms", 60000));
        csDept.addUnit(new Student("Alice", "CS001", 30000));
        csDept.addUnit(new Student("Bob", "CS002", 35000));

        Department itDept = new Department("Department of Information Technology");
        itDept.addUnit(new Teacher("Prof. Reyes", "Networks", 55000));
        itDept.addUnit(new Student("Carol", "IT001", 28000));

        engCollege.addUnit(csDept);
        engCollege.addUnit(itDept);

        College businessCollege = new College("College of Business");
        Department mgmtDept = new Department("Department of Management");
        mgmtDept.addUnit(new Teacher("Dr. Santos", "Marketing", 70000));
        mgmtDept.addUnit(new Student("Dan", "MGT001", 32000));

        businessCollege.addUnit(mgmtDept);

        university.addUnit(engCollege);
        university.addUnit(businessCollege);

        System.out.println("=== University Details ===");
        university.getDetails("");

        System.out.println("\nTotal Students: " + university.getStudentCount());
        System.out.println("Total Budget: " + university.getBudget());
    }
}
