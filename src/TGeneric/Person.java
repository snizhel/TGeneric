package TGeneric;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





public class Person <T> {

	  private ArrayList<T> al = new ArrayList<T>();

	  public void add(T obj) {
		
	   al.add(obj);
	  }

	  public void display() {
	   for (T o : al) {
	    System.out.println(o);
	   }
	  }
	  @Override
	  public String toString() {
	      return " "+al;
	  }

	  
	  
	}