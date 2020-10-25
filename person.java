public class person{
	Private String first;
	Private String other;
	Private String surname;
	Private int age;
	
	public person (){
		
	}
	
	public thePerson ( String first, String surname){
		this.first = first;
		this.surname = surname;
	}
	
	public String getfirstname(){
		return this.first;
	}
	
	public void String setother (String other){
	    this.other = " ";
	}
	public int age(int age) {
		this.age = age;
	}
	public void printFullName(){
		String first = this.first;
		String other = this.other;
		String surname = this.surname;
		
		System.out.println(first, other, surname);
		
	}
	public void ageToString(){
		int age = this.age
		System.out.print(age.toString())
	}
}