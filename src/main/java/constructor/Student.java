package constructor;

public class Student {
	String name; // null
	int student_id; // 0
	int age; // 0
	int hight;
	int weight;

	public static void main(String[] args) {

		Student st1 = new Student("Tom", 101, 10,5,40);
		System.out.println(st1.name + " " + st1.student_id + " " + st1.age+""+st1.hight+""+st1.weight);

		Student st2 = new Student("Grey", 102, 11,5,40);
		System.out.println(st2.name + " " + st2.student_id + " " + st2.age+""+st1.hight+""+st1.weight);

		Student st3 = new Student("Jack", 102, 11,5,40);
		System.out.println(st3.name + " " + st2.student_id + " " + st2.age+""+st1.hight+""+st1.weight);

	Student st4 = new Student("Peter",103);
	System.out.println(st4.name+" "+st4.student_id);
	
	}

	public Student (String name, int student_id, int age,int hight,int weight) {
		this.name = name;
		this.student_id = student_id;
		this.age = age;
	}
	public Student(String name,int student_id) {
		this.name=name;
	}

	
}