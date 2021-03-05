import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private Employee employee;

    protected void setUp() throws Exception {
        employee = new Employee();
    }
    @Test
    void testSetAndGetFirstName() {
        String testFirstName = "James";
        assertNull(employee.getFirstName());
        employee.setFirstName(testFirstName);
        assertEquals(testFirstName, employee.getFirstName());
    }
    @Test
    void testSetAndGetLastName() {
        String testLastName = "Johnson";
        assertNull(employee.getLastName());
        employee.setFirstName(testLastName);
        assertEquals(testLastName, employee.getLastName());
    }
    @Test
    void testSetAndGetAge() {
        int testAge = 33;
        assertEquals(0, 0, 0);
        employee.setAge(testAge);
        assertEquals(testAge, employee.getAge(), 0);
    }
    @Test
    void testSetAndGetJobTitle() {
        String testJobTitle = "gamer";
        assertNull(employee.getJobTitle());
        employee.setJobTitle(testJobTitle);
        assertEquals(testJobTitle, employee.getJobTitle());
    }
    @Test
    void testSetAndGetCompany() {
        String testCompany = "Some Company";
        assertNull(employee.getCompany());
        employee.setCompany(testCompany);
        assertEquals(testCompany, employee.getCompany());
    }
    @Test
    void testSetAndGetSalary() {
        int testSalary = 1000;
        assertEquals(0, 0, 0);
        employee.setAge(testSalary);
        assertEquals(testSalary, employee.getSalary(), 0);
    }
    @Test
    void introMsg() {

        String testName = "James";
        String testSurname = "Johnson";
        int age= 36;
        String testWelcome="Hello I am " + testName + " " + testSurname + " and I am " + age +" years old!";
        assertEquals("Hello I am James Johnson and I am 36 years old!",testWelcome);

    }

    @Test
    void jobDesc() {
        String testCompany = "Tired Company";
        String jobTitle = "Pleasehelpme";
        String testDesc ="I work in " + testCompany + " as " + jobTitle;
        assertEquals("I work in Tired Company as Pleasehelpme",testDesc);
    }

    //this test is bit to hard for me at the current moment to grasp it
//    @Test
//    void sortBySalary() {
//
//    }


}