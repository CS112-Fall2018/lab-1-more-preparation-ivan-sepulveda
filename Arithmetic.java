public class Arithmetic{
	public static void main(String[] args){
	/**
	Declaring/Assigning intergers and floats
	*/
	int a = 2;
	int b = 4;
	float x = 0.5f;
	float y = 0.25f;
	// Addition
	System.out.println(a+b); // a plus b, b plus a not needed
	System.out.println(a+x); // a plus x
	System.out.println(a+y); // a plus y
	System.out.println(b+x); // b plus x
	System.out.println(b+y); // b plus y
	System.out.println(x+y); // x plus y
	// Division
	// Start with all a-operations
	System.out.println(a/b); // a divided by b
	System.out.println(a/x); // a divided by x
	System.out.println(a/y); // a divided by y
	// All b-operationso
	System.out.println(b/a); // b divided by a
	System.out.println(b/x); // b divided by x
	System.out.println(b/y); // b divided by y
	// All x-operations
	System.out.println(x/a); // x divided by a
	System.out.println(x/b); // x divided by b
	System.out.println(x/y); // x divided by y
	// All y-operations
	System.out.println(y/a); // y divided by a
	System.out.println(y/b); // y divided by b
	System.out.println(y/x); // y divided by x

	}
}