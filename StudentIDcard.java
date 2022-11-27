/**
 * 
 */
package studentManagement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


/**
 * @author admin
 *
 */
public class StudentIDcard {
static Scanner scanner =new Scanner(System.in);
static HashMap<Integer,Student>map=new HashMap<Integer,Student>();
	public static void main(String[] args) {
			
while(true) {
 System.out.println("welcome to Student Management portal");
  System.out.println("************************************");
   System.out.println("Enter the operation from below ");
    System.out.println("1.create a new student ");
     System.out.println("2.update a student");
      System.out.println("3.read all the student ");
       System.out.println("4.delete a Student ");
         System.out.println("5.logout");
 int var = scanner.nextInt();
 switch(var) {
 case 1:
       createNewStudent();
       break;
 case 2:     
       updateStudent();
       break;
 case 3:      
       readStudent();
       break;
 case 4:      
       deleteStudent();
       break;
 case 5:     
      System.exit(0);
       break;
             }     
       }
}

public static void deleteStudent() {
		System.out.println("Enter ID to Delete");
        int id =scanner.nextInt();
if(map.containsKey(id))
   map.remove(id);
	if(!map.containsKey(id)) {	
		    System.out.println("Successfully Deleted");
	}else {
		 System.out.println("Something Went Wrong");
	     }		
	}

public static void readStudent() {
for(Map.Entry read:map.entrySet()){
  Student Stud =(Student)read.getValue();			
	System.out.println("______________________________");	
 
	System.out.println("ID="+Stud.getId());
	  System.out.println("NAME="+Stud.getName());
	   System.out.println("CLASSNO+"+Stud.getClassno());
		 System.out.println("AGE="+Stud.getAge());	
			System.out.println("______________________________");			
	}
}

public static void updateStudent() {
	System.out.println("Enter the Student Update ID");
        int id =scanner.nextInt();
 if(map.containsKey(id)) {  
	 System.out.println("choose what to update");
	  System.out.println("1.Name");
	   System.out.println("2.Age");
		 System.out.println("3.back");
	   int option =scanner.nextInt();
switch(option) {
case 1:		    
	Student Stud1 = (Student)map.get(id);    
	  System.out.println("Enter The New Name");
		    Stud1.setName(scanner.next());
		    break;
case 2:		    
	 Student Stud2 =(Student)map.get(id);   
	   System.out.println("Enter the New age");
		    Stud2.setAge(scanner.nextInt());
		    break;
              }
       }  
}

public static void createNewStudent() {
		   System.out.println("Enter the new Student ID");
int id =scanner.nextInt();
		   System.out.println("Enter the new Student Name");
String name =scanner.next();  
		   System.out.println("Enter the new Student Classnum");
int classno =scanner.nextInt(); 
		   System.out.println("Enter the new Student Age");
int age =scanner.nextInt();
		   
Student Stud =new Student(id,name,classno,age);
		   map.put(id, Stud);	   
}
}