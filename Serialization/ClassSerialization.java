package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class demo implements java.io.Serializable {
	public int a;
	String b;

	public demo(int a, String b) {
		this.a = a;
		this.b = b;
	}
}
class Test {
	public static void main(String[] args) {
		demo obj = new demo(10, "Sachin");
		try {

			FileOutputStream file = new FileOutputStream("C:\\New folder\\Data.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(obj);
			out.close();
			file.close();

			System.out.println("file is created");

		} catch (Exception e) {
			System.out.println("Exception is failed");
		}
		
		demo obj1 = null;
		try {
			FileInputStream file = new FileInputStream("C:\\New folder\\Data.txt");
			ObjectInputStream in = new ObjectInputStream(file);

			obj1 = (demo) in.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			System.out.println("a = " + obj1.a);
			System.out.println("b = " + obj1.b);
		} catch (Exception e) {
			System.out.println("exception is failed");
		}
	}
}
