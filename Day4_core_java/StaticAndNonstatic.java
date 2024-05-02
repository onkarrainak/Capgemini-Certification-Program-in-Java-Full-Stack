package onkar.Day4_core_java;

public class StaticAndNonstatic {
	int sid;
	String name;
	static String cname;

	public StaticAndNonstatic(int sid, String name) {

		this.sid = sid;
		this.name = name;

	}

	public static void readcname() {
		cname = "JAVA";
	}

	public void dispStudent() {

		System.out.println(sid + " " + name + " " + cname);
	}

	public static void main(String[] args) {

		readcname();
		StaticAndNonstatic s1 = new StaticAndNonstatic(1001, "shan");
		s1.dispStudent();
		StaticAndNonstatic s2 = new StaticAndNonstatic(1002, "RAJ");
		s2.dispStudent();
		StaticAndNonstatic s3 = new StaticAndNonstatic(1003, "SIJU");
		s3.dispStudent();
		StaticAndNonstatic s4 = new StaticAndNonstatic(1004, "onkar");
		s4.dispStudent();

	}

}
