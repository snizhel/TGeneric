package TGeneric;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
	
	public int id;
	public String name;
 

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
       
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

   
    
    public String toString() {
        return "Student = {" +
                "id='" + getId() + '\''+
                ", name='" + getName() + '\''+
                
                
                '}';
    }
    
    

}
