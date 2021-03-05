public class Employee implements java.io.Serializable{
    transient public Thread myThread;
    public String firstName;
    public String lastName;
    public int age;
    public String jobTitle;
    public String company;
    public int salary;
    Employee(){
        this.firstName=null;
        this.lastName=null;
        this.age=0;
        this.jobTitle=null;
        this.company=null;
        this.salary=0;
    }; //default constructor
    public Employee(String name, String surName, int theAge, String job,String organization, int theSalary){
        firstName=name;
        lastName=surName;
        age=theAge;
        jobTitle=job;
        company=organization;
        salary=theSalary;
    } //constructor

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    //method to convert objects values to string
    public String toString(){
        return this.firstName + " with salary " +this.salary;
    }

    public void introMsg(){
        System.out.println("Hello I am " + this.firstName + " " + this.lastName + " and I am " + this.age +" years old!");
    }
    public void jobDesc(){
        System.out.println("I work in " + this.company + " as " + this.jobTitle);
    }
    public void sortBySalary(){

    }
    public static void main(String arg[]){
        Employee Jerry = new Employee("Jerry","Baskins", 25,"Pilot","AirBaltic",2500); //since my constructor requires two string parameters we must input both of them
        Jerry.setLastName("Blazer"); //checking a setter
        Jerry.introMsg();
        Jerry.jobDesc();

    }
}