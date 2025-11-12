package inheritance;
class Animal
{
	String name;
	int age;
	
	Animal()
	{
		System.out.println("Animal Default Constructor Called");
		 name="not assign";
		 age=20;
	}
	
	  Animal(String name, int age) {
		 System.out.println("Animal Parameter Constructor Called");
		this.name = name;
		this.age = age;
	}

	String getName() {
		return name;
	}
	 void setName(String name) {
		this.name = name;
	}
	 int getAge() {
		return age;
	}
	 void setAge(int age) {
		this.age = age;
	}
	 
	 void display()
	 {
		 System.out.println("Animal Name is "+this.name);
		 System.out.println("Animal Age is "+this.age);
	 }
	
}

class Dog extends Animal
{
	String breed;
	String Color;
	
	Dog()
	{
		super();
		System.out.println("Dog Default Constructor Called");
		
		 breed="Bread";
		 Color="Black";
	}
	
	  Dog(String name, int age, String breed, String color) {
		  super(name,age);
		  System.out.println("Dog Para Constructor Called");
		this.breed = breed;
		Color = color;
	}

	
	 String getBreed() {
		return breed;
	}
	 void setBreed(String breed) {
		this.breed = breed;
	}
	 String getColor() {
		return Color;
	}
	 void setColor(String color) {
		Color = color;
	}
	 
	 void display()
	 {
		 super.display();
		 System.out.println("Dog Breed is "+this.breed);
		 System.out.println("Dog color is "+this.Color);
	 }
}

class Cat extends Animal
{
	String Color;
	
	Cat()
	{
		super();
		System.out.println("Cat Default Constructor Called");
		 Color="White";
	}
	
	  Cat(String name, int age, String color) {
		  super(name,age);
		  System.out.println("Cat Para Constructor Called");
		
		Color = color;
	}

	
	 String getColor() {
		return Color;
	}
	 void setColor(String color) {
		Color = color;
	}
	 
	 void display()
	 {
		 super.display();
		 System.out.println("Cat color is "+this.Color);
	 }
}

class Bird extends Animal
{
	
	int wingSpan;
	
	Bird()
	{
		super();
		System.out.println("Bird Default Constructor Called");
		
		 wingSpan=2;
	}
	
	 public Bird(String name, int age, int wingSpan) {
		 super(name,age);
		 System.out.println("Bird Para Constructor Called");
		this.wingSpan = wingSpan;
	}

	
	 int getWingSpan() {
		return wingSpan;
	}
	 void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
	
	 void display()
	 {
		 super.display();
		 System.out.println("Bird color is "+this.wingSpan);
	 }
	
}
public class InheritanceAnimal {

	public static void main(String[] args) {
		
		Dog d1=new Dog();
		d1.display();
		System.out.println("\n\n");
		
		Dog d2=new Dog("Rocky",2,"Breed","Black_White");
		d2.display();
		System.out.println("\n\n");
		
		Cat c1=new Cat();
		c1.display();
		System.out.println("\n\n");
		
		Cat c2=new Cat("Riu",3,"White");
		c2.display();
		System.out.println("\n\n");
		
		Bird b1=new Bird();
		b1.display();
		System.out.println("\n\n");
		
		Bird b2=new Bird("Chii",5,2);
		b2.display();
		System.out.println("\n\n");

	}

}
