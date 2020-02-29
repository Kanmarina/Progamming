package day43;

public class CodeNote_ClassAndObject {
    /*
    Class and Object
Class is a template for Object
it can define what kind of attribute and behaviour an object should have
attrinute : -->> instance variables | fields
behaviour : -->> instance methods
Object is the actual thing created out of this template
and any object created out of same template will have the attribute and behaviours defined in the template
Protecting the data|attribute of the object
we can encapsulate the instance field by making it private and provide public getters and setters
we have 4 access modifier :
	public , protected , default , private
(IGNORE protected for now until inheritance topic comes in )
public -->> accessible anywhere
default -->> no access modifer
		--> only within the package , also known as package private
private -->> only accessible within the same class
outside of the class when we create object we can give a object any name we want , like p1, p2  or any other name
if we want to refer the object in the template itself , we can use the keyword -->> this --> the current object we are working on
so outside the template it would look like  :
	Person p1 = new Person() ;
	p1.age = 18 ;
	p1.eat() ;
inside your template it would look like  :
	this.age -->> to point to the instance field age
	this.name -->> to point to the instance field name
	this.eat();  // optional , usually it will just work without
public class Person{
	private int age ;
	private String name;
	public int getAge(){
		return age ; // return this.age;
	}
	public void setAge(int newAge){
		// YOU HAVE OPTION HERE TO ADD BUNCH OF VALIDATION OR COED
		// TO MAKE SURE WE DONT HAVE INVALID AGE HERE
		age = newAge ;
	}
	public String getName(){
		return name; // return this.name;
	}
	public void setName(String name){
		// BUNCH OF VALIADITON I CAN USE HERE ....
		this.name = name ;
	}
	public void eat(){
		print(name + "eating") ;
	}
}
Computer
	attributes:  make it private
		brand, ram (1-128) , price
	behaviour
		runProgram
			--> print brand is running program with the ram  (size)
		calculate
			-->> print brand is calculating
		add getters and setters to all the fields
		ram can not be less than 1 more than 128
		price can not be less than 20
		toString method
Scanner scan = new Scanner(System.in);
String str = new String("abc");
Integer i1 = new Integer("12");
Integer i2 = new Integer(12);
Computer c1 = new Computer() ;
--- Constructor Review ---
Integer i1 = new Integer(12);
// how the constructor for Integer might look like
public Integer(int num){
	// some code here
}
Integer i1 = new Integer("12");
public Integer(String num){
	// some code here
}
Constructor is a block of code that run when object is being created
	it has same name as class name
	and has no return type
	it can be overloaded
Most use case of constructor is
	to provide inititial state (attribute values)
	for the object while being created
public Coffee {
	private String type;
	private int caffeineLevel
	private double price;
	// getters and setters here omitted
	// no arg constructor
	public Coffee(){
		//print("no arg constructor")
	}
	// 2 args constructor to set type and caffine level
	public Coffee(String type, int caffeineLevel){
		this.type = type;
		this.caffeineLevel = caffeineLevel ;
	}
	// WAKE UP TASK TO CREATE 3 ARGS CONSTRUCTOR
	// DO NOT LET THE PRICE GO BELOW 0
	// IF IT's less than 0 make it 1$

	Class -- blue print for an object
	attributes of object
		instance fields
	behaviour of object
		instance methods
	constructor
		a spacial block of code that run while object is being created
		it has same as class name
		no return type
		It can be overloaded (different param list)
static members should be accessed in STATIC WAY!!!
ClassName.staticMethodName(...)
	static members
		 static method
		 	a method with static keyword
		 	can be called in static way
		 	call directly in main (if in same class)
		 	ClassName.staticMethodName(...)
		 		Pet.showGeneralPetInfo();
		 static field
-----------
ONCE you create a class , it can a type for :
	reference variable
		 Pet mypet ;
	it can show up in couple places
		 local variable : variable inside your method
		 method parameter data type:
		 field  : outside method , under the class
    it can also be a return type for your method
------  Constructor VS Setters --------
constructor :
	good when you want to create object with initial state (attribute values given)
setter :
	good when you want to change the value of existing object fields
 How to create a class that generate only immutable objects :
 create a class with private instance filed
 add a constructor to set the value while object is being created
 	 only provide getters for private fields
 	 but do not provide setters for private fields
 	 public class Person{
 	 	private String name ;
 	 	private int age ;
 	 	public Person(String name, int age){
 	 		this.name = name;
 	 		this.age = age;
 	 	}
 	 	public String getName(){
 	 		return name;
 	 	}
 	 	public int getAge(){
 	 		return age;
 	 	}
 	 }
 	 Person p1 = new Person("Jon Snow",27);
any data type that not primitive type
	its called reference type
	any reference variable store :
		 reference to the object in the heap
		 pointer to the object in the heap
		 address of the object in the heap
		 just like leash of the dog
		 just like remote of the tv
by its type
	primitive | reference variable
by its location
	local variable
	method parameter
	field
}
     */
}
