
public class Person {

	private String name;
	
	public Person(String aName){
		name = aName;
	}
	
	public int compareTo(Person otherPerson){
		return this.name.compareTo(otherPerson.name);
	}
	
	public String toString(){
		return this.name;
	}
}
