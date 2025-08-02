package starsprinting;
import java.util.*;
public class ODD {
public static void main(String[] args) {
	int a;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	System.out.println((a%2==0)?"EVEN":"ODD");
	s.close();
}
}
