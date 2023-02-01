package Serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

class Emp implements Externalizable 
	{
	 String name;
	 int age;
	 int a;
	 int b;
	
	
	
	public Emp() {
		System.out.println("helo");
	}
	public Emp(String name, int age, int a, int b) {
		super();
		this.name = name;
		this.age = age;
		this.a = a;
		this.b = b;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeInt(age);
		out.writeInt(a);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		age=in.readInt();
		a =in.readInt();
	}
		

	}
