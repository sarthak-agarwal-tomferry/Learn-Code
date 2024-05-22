public interface EmployeeRepository {
    void save(Employee employee);
}

public class Database implements EmployeeRepository {
    @Override
    public void save(Employee employee) {
        // Code to save employee to the database
    }
}

public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}

public class Employee {
    private String name;
    private String address;

    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters and setters
}