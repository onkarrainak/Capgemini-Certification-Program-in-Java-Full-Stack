package onkar.Core_Java_stream_API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


class Emp {
	int eid;
	String ename;
	String designation;
	int salary;


	public Emp(int eid, String ename, String designation, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.designation = designation;
		this.salary = salary;


	}


	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", designation=" + designation + ", salary=" + salary + "]";
	}


}


public class StreamAPI {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> a1 = new ArrayList<>();
		a1.add(new Emp(1, "Manya", "Manager", 23000));
		a1.add(new Emp(2, "Avinash", "TL", 24000));
		a1.add(new Emp(3, "Munna", "Dev", 32000));
		a1.add(new Emp(4, "Pooja", "Trainer", 39000));
		a1.add(new Emp(3, "Munna", "Dev", 32000));


		List<String> list = a1.stream().map(a -> a.toString()).collect(Collectors.toList());
		System.out.println("Emp List : " + list);
		Long countLong = a1.stream().count();
		System.out.println("Count is : " + countLong); // 5


		Set<String> list1 = a1.stream().map(a -> a.toString()).collect(Collectors.toSet());
		System.out.println("Emp List : " + list1);
		Long countLong1 = list1.stream().count();
		System.out.println("Count is : " + countLong1); // 4


	}


}