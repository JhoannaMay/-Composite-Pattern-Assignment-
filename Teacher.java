public class Teacher implements Unit {
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name + " (Teacher)";
    }

    @Override
    public void getDetails(String prefix) {
        System.out.println(prefix + "Teacher: " + name + ", Subject: " + subject + ", Salary: " + salary);
    }

    @Override
    public int getStudentCount() {
        return 0;
    }

    @Override
    public double getBudget() {
        return salary;
    }
}
