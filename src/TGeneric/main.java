package TGeneric;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Person<Student> generic = new Person<Student>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ten : ");
		String name = scanner.nextLine();
		System.out.print("Nhap id : ");
		int id = scanner.nextInt();
		generic.add(new Student(id,name, id));
		generic.display();
		

	}
}
