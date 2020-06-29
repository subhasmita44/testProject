package level1;

public class UseThisKey {
	private String name;
	private int age;
	private float weight;
	
	void withThisFunction(String name,int age,float weight) {
		this.name=name;
		this.age=age;
		this.weight=weight;
		//System.out.println(name+" "+age+" "+weight);
	}
	
void withoutThisFunction(String name,int age,float weight) {
	name=name;
	age=age;
	weight=weight;	
	//System.out.println(name+" "+age+" "+weight);
	}
void putDetails() {
System.out.println("name"+name);
System.out.println("age"+age);
System.out.println("weight"+weight);
}

	public static void main(String[] args) {
UseThisKey key=new UseThisKey();
key.withThisFunction("sima", 25, 70.0f);
//key.withoutThisFunction("lima", 26, 70.1f);
key.putDetails();
	}

}
