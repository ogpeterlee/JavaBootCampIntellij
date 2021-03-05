public class Person {

    String firstName;
    String lastName;
    int age;
    Person(){
        this.firstName=null;
        this.lastName=null;
        this.age=0;
    }

    //parametized consturcotr
    public Person(String firstName, String lastName, int age) throws CustomException{
        if(firstName.matches(".*\\d.*")){
            throw new CustomException("Firstname cannot contain numbers: " + firstName);
        }else if(lastName.matches(".*\\d.*")){
            throw new CustomException("Lastname cannot contain numbers: " + lastName);
        }else{
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            System.out.println("You've created a valid person!");
        }
    }
    //getters and setters
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
    public int getAge()
    {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void introMsg(){
        System.out.println("Hello I am " + this.firstName + " " + this.lastName + " and I am " + this.age +" years old!");
    }

    public static void main(String arg[]){
        Person Ivans = new Person();
        Ivans.setFirstName("Ivans");
        Ivans.setLastName("Johnson");
        Ivans.setAge(69);
        Ivans.introMsg();




    }
}