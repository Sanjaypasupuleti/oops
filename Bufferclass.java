package starsprinting;

public class Bufferclass {
	public static void main(String[] args)
	{
		StringBuffer s=new StringBuffer("sanjay");
		s.append("saaho");
		s.insert(3,"u");
		s.replace(5, 6, "uu");
	    System.out.println(s);
	}

}
