package day02work;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	public static void main(String[] args) {
		Person pers = new Person("LTY",20,"ÄÐ");
		Person pers2 = new Person();
		Person pers3 = new Person("H",18);	
	}
	
	public Person(String n, int a, String g) {
		super();
		name = n;
		age = a;
		gender = g;
		System.out.println(name+" "+age+" "+gender);
	}

	public Person() {
		super();	
	}
	public Person(String n, int a) {
		super();
		name = n;
		age = a;
		System.out.println(name+" "+age);
	}
}
