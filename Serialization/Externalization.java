package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Externalization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Emp emp = new Emp("virat", 29, 10, 27);
		
		try {
			FileOutputStream files = new FileOutputStream("C:\\New folder\\n.txt");
			ObjectOutputStream outs = new ObjectOutputStream(files);

			outs.writeObject(emp);

			System.out.println("It is created");
		} catch (Exception e) {
			System.out.println("It is failed");
		}
	
		try {
			FileInputStream infile = new FileInputStream("C:\\New folder\\n.txt");
			ObjectInputStream inner = new ObjectInputStream(infile);

			Emp obj = (Emp) inner.readObject();

			System.out.println("file  is created  successfull ");
			System.out.println("name :" + obj.name);
			System.out.println("age :" + obj.age);
			System.out.println("a value :" + obj.a);
			System.out.println("b value :" + obj.b);
		} catch (Exception e) {
			e.printStackTrace();
//	}finally {
//		
		}
	}
}
