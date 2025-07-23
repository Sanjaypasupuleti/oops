package starsprinting;
import java.util.*;
public class input {
	public static void main(String[] args) {
		String name;
		int age;
		float weight;
		Scanner input = new Scanner(System.in);
		System.out.println("Name");
		name=input.next();
		System.out.println("Age");
		age=input.nextInt();
		
		System.out.println("weight");
		weight=input.nextFloat();
		System.out.println("name"+name +",Age"+age +",weight"+weight);
		input.close();
		
	}
     
       
}
