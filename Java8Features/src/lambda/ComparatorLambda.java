package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Mike", 20, "M"));
		personList.add(new Person("Steve", 30, "M"));
		personList.add(new Person("Karen", 25, "F"));
		personList.add(new Person("Daniel", 18, "M"));
		personList.add(new Person("Sarah", 6, "F"));
		
		// Sort with Inner Class
		Collections.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		printList(personList);
		
		// Use Lambda instead
		Collections.sort(personList, (Person p1, Person p2) -> p2.getName().compareTo(p1.getName()));
		printList(personList);

		Collections.sort(personList, (Person p1, Person p2) -> p1.getAge() - p2.getAge());
		printList(personList);
	}
	
	public static void printList(List<Person> list) {
		System.out.println("===========");
		for(Person p : list) {
			System.out.println(p);
		}
	}
}

class Person{
	private String name;
	private int age;
	private String gender;
	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}