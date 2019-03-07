package ToyStore;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
            Toy giJoe = new Toy("giJoe",10);
            Toy sorry = new Toy("sorry",5);
            giJoe.setCount(5);
            sorry.setCount(8);
            System.out.println(giJoe.toString());
            System.out.println(sorry.toString());
	}
}