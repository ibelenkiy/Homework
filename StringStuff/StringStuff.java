public class StringStuff {
    public class void test1(){
	String s1 = "Hello";
	String s2 = "Hello";
	String s3 = new String("Hello");
	String s4 = new String("Hello");
	System.out.println("s1==s2:  " +(s1 == s2));
	System.out.println("s1==s3:  " +(s1 == s3));
	System.out.println("s1==s4:  " +(s1 == s4));
	System.out.println("s1==s2:  " +(s2 == s3));
	System.out.println("s1==s2:  " +(s2 == s4));
	System.out.println("s1==s2:  " +(s3 == s4));
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1.equals(s4));
	System.out.println(s1.equals("Hello");
    }
}
