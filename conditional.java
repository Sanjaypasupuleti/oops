package starsprinting;
import java.util.*;
public class conditional {
	public static void main(String[] args) {
	int a;
	int fact=1;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	for(int i=1;i<=a;i++) {
		fact=fact*i;
		
	}
	System.out.println("factorial "+fact);
	s.close();
	
	
	}
	
}
