import java.util.*;
public class Driver{
    public static void main(String[] args){
	ArrayList<Integer> al = new ArrayList<Integer>();
	System.out.println(al);
	Random r = new Random();
	int i = 0;
	while(i<20){
	    al.add(r.nextInt(5));
	    i++;
	    	System.out.println(al);
	}
	System.out.println(al);
	    }
}
