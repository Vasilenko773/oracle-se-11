package oracle.se.part1.extending;

class Employee {

    private String type;

    private String name;

    Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

class Company {
    public static int branchCount;
    public static int employeeCount;

    public void addEmployee(Employee e) {
        employeeCount++;
    }

    public static void addBranch(Branch b) {
        branchCount++;
    }

    static {
        System.out.println("static block");
        branchCount = 10;
    }
}

class Branch extends Company {

    private String branchName = "unspecified";
    public int branchCount;
    public int employeeCount;

    Branch(String branchName) {
        this.branchName = branchName;
    }

    public void addEmployee(Employee e) {
        employeeCount++;
    }

    {
        System.out.println("static block branch");
        this.employeeCount = 200;
    }
}

public class OnBoardBranch {

    public static void main(String[] args) {

        Branch b = new Branch("RedBranch");
        Employee e1 = new Employee("migel", "president");
        Employee e2 = new Employee("Huares", "doctor");
        Company company = new Company();
        company.addBranch(b);
        b.addEmployee(e1);
        b.addEmployee(e2);

        System.out.println(Company.branchCount);
        System.out.println(Company.employeeCount);

        System.out.println(b.branchCount);
        System.out.println(b.employeeCount);
    }
}
