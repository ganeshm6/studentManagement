/**
 * 
 */
package studentManagement;

/**
 * @author admin
 *
 */
public class Student  {
       public int id;
       public String name;
       public int classno;
       public int age;
public Student(int id,String name,int classno,int age) {	
	   this.id =id;
	   this.name =name; 
	   this.classno =classno;
      this.age =age;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getClassno() {
	return classno;
}
public void setClassno(int classno) {
	this.classno = classno;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}	
		
}
