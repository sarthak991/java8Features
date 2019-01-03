package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Java8Features {
   
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Sarthak","Mohapatra",27),new Person("Sarthak1","Mohapatra1",25),new Person("Sarthak3","Mohapatra2",29),
				new Person("Sarthak4","Mohapatra7",22));
		
		printConditionally(persons,p -> p.getFirstName().startsWith("S") && p.getAge()>25 ,System.out :: println);
	}
	
	private static void printConditionally(List<Person> persons,Predicate<Person> condition,Consumer<Person> consumer) {
		persons.stream().filter(condition).forEach(consumer);
		System.out.println(persons.stream().findFirst());
	}
}
