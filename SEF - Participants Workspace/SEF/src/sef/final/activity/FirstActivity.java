import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class FirstActivity implements Comparator<Employee> {
    // Used for sorting in descending order of salary
public int compare(Employee a, Employee b){
    return b.salary - a.salary;
}
static int i=1;
    public static void main(String[] args) {
        //creating list with object employee
        List<Employee> list = new ArrayList<Employee>();
        Employee employee1 = new Employee("John","Dou",21,"Mailman","postaloffice",1000);
        Employee employee2 = new Employee("Derek","Kai",34,"Tester","accenture",1111);
        Employee employee3 = new Employee("Elizabeth","Smoking",27,"Programmer","google",1992);
        Employee employee4 = new Employee("Darja","Goodlookin",24,"Analyst","google",2400);
        Employee employee5 = new Employee("Beth","Meh",27,"Lawyer","google",1500);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        //printing out numbered unsorted list
        System.out.println("Unsorted List:");
        for( Employee val : list){
            System.out.println(i++ +"."+val);
        }
        //using collections and sort from collections and comparator packages to perform sorting
        Collections.sort(list,new FirstActivity());
        System.out.println();
        System.out.println("Sorted by salary List: ");
        int i=1;
        //printing out numbered sorted list
        for (Employee val : list){
            System.out.println(i++ + ". "+val);
        }
        //saving list to .txt file
        File target= new File(".\\SEF - Participants Workspace\\SEF\\src\\sef\\final\\employeeList.txt");
        try {
            System.out.println("Saving ArrayList of Strings");
            //We use FileOutputStream to save raw bytes to a file
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(target));
            out.writeObject(list);

            //Flushes the stream.
            //This will write any buffered output bytes and flush through to the underlying stream.
            out.flush();
            out.close();
            System.out.println("Done!");
        }catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
